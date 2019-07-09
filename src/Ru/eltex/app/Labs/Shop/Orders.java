package Ru.eltex.app.Labs.Shop;

import java.sql.Time;
import java.util.LinkedList;

public class Orders<T extends Order> {

    private LinkedList<T> Orders = new LinkedList<>();

    public synchronized void makepurchase(Credentials credentials, Cart cart) {

        Orders.add((T) new Order(cart, credentials));
    }

    public synchronized void complitecheck() {
        for (T order : Orders) {
            Time NowTime = new Time(System.currentTimeMillis());

            if (NowTime.getTime() >= order.getWaittime().getTime()) {
                order.setStatus(true);
            }
        }
    }

    public synchronized void delete() {
        for (T order : Orders) {
            //if (order.isStatus()) {
                Orders.remove();
            //}
        }
    }

    public synchronized void showorders() {
        for (T tyt : Orders) {
            tyt.showorder();
        }
    }

    public LinkedList<T> getOrders() {
        return Orders;
    }
}
