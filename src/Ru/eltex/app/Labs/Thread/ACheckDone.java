package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Orders;

public class ACheckDone extends ACheck {
    private boolean finish = true;

    @Override
    public void run() {
        while (!finish) {
            Orders localorders = Main.getOrders();
            localorders.delete();
            Main.setOrders(localorders);
        }
    }
    public void ostonovis() {
        finish = true;
    }
}
