package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;
import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Orders;

import java.util.Random;


public class Generator extends Thread {

    private boolean finish = false;

    @Override
    public void run() {
        Random rnd = new Random(System.currentTimeMillis());
        while (!finish) {
            Orders localorders = Main.getOrders();
            int num = 1 + rnd.nextInt(20000 - 1 + 1);
            int kol = 1 + rnd.nextInt(10 - 1 + 1);
            localorders.makepurchase(new Credentials(Surname.getSurname(), Imena.getImena(), Otchestva.getOtchestva(), num + "@mail.ru"), new Cart(kol));
            Main.setOrders(localorders);
        }
    }

    public void ostonovis() {
        finish = true;
    }
}
