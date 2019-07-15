package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Orders;

public class ACheckWait extends ACheck {
    private boolean finish = true;

    @Override
    public void run() {
        while (!finish) {
            Orders localorders = new Orders(Main.getOrders());
            localorders.showorders();
            localorders.complitecheck();
            Main.setOrders(localorders);
        }
    }

    public void ostonovis() {
        finish = true;
    }
}
