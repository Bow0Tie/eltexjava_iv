package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Main;

public class ACheckDone implements Runnable {
    private Main Orders;

    public ACheckDone(Main Orders) {
        this.Orders = Orders;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            Orders.getOrders().delete();
        }
    }
}
