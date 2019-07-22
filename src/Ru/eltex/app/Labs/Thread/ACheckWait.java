package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Main;

public class ACheckWait implements Runnable {
    private Main localOrders;

    public ACheckWait(Main localOrders) {
        this.localOrders = localOrders;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
            localOrders.getOrders().complitecheck();
        }
    }
}
