package Ru.eltex.app.Labs.Shop;

import java.util.LinkedList;

public class Orders<T extends Order> {

    private LinkedList<T> Orders = new LinkedList<>();

    public synchronized void makepurchase(Credentials credentials, Cart cart) {

        Orders.add((T) new Order(cart, credentials));
    }

    public void complitecheck() {
        for (T order : Orders) {
            if (System.currentTimeMillis() >= order.getWaittime().getTime()) {
                order.setStatus(true);
            }
        }
    }

    public void delete() {
        for (T order : Orders) {
            if (order.isStatus()) {
                Orders.remove();
            }
        }
    }

    public void showorders() {
        for (T tyt : Orders) {
            tyt.showorder();
        }
    }

    public LinkedList<T> getOrders() {
        return Orders;
    }
}
