package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Orders;

public class ACheckWait extends ACheck {
    private boolean finish = true;

    @Override
    public void run() {
        while (!finish) {
            Orders localorders = Main.getOrders();
            localorders.complitecheck();
            Main.setOrders(localorders);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ostonovis() {
        finish = true;
    }
}
