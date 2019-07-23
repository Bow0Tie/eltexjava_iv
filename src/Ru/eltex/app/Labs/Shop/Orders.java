package Ru.eltex.app.Labs.Shop;

import java.sql.Time;
import java.util.LinkedList;

public class Orders<T extends Order> {

    private LinkedList<T> Orders = new LinkedList<>();

    public Orders() {
    }

    public Orders(Orders other) {
        this.Orders.addAll(other.Orders);
    }

    public void makepurchase(Credentials credentials, Cart cart) {
        synchronized (this) {
            Orders.add((T) new Order(cart, credentials));
        }
    }

    public void complitecheck() {
        synchronized (this) {
            for (T order : Orders) {
                Time NowTime = new Time(System.currentTimeMillis());

                if (NowTime.getTime() >= order.getWaittime().getTime()) {
                    order.setStatus(true);
                }
            }
        }
    }

    public void delete() {
        synchronized (this) {
            Orders.removeIf(Order::isStatus);
        }
    }

    public synchronized void showorders() {
        for (T tyt : Orders) {
            tyt.showorder();
        }
    }
}
