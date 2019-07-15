package Ru.eltex.app.Labs.Shop;

import java.sql.Time;
import java.util.Iterator;
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
//        for (int i = 0; i < Orders.size(); i++) {
//            T element = Orders.get(i);
//            if (element.isStatus()) {
//                Orders.remove(element);
//            }
//        }
        for (Iterator<T> iter = Orders.iterator(); iter.hasNext(); ) {
                T element = iter.next();
                if (element.isStatus()) {
                    iter.remove();
                }
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
