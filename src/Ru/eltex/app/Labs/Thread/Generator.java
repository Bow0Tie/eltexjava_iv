package Ru.eltex.app.Labs.Thread;

import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;
import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;

import java.util.Random;


public class Generator implements Runnable {

    private Main Orders;

    public Generator(Main Orders) {
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
            Random rnd = new Random(System.currentTimeMillis());
            int num = 1 + rnd.nextInt(20000 - 1 + 1);
            int kol = 1 + rnd.nextInt(10 - 1 + 1);
            Orders.getOrders().makepurchase(new Credentials(Surname.getSurname(), Imena.getImena(), Otchestva.getOtchestva(), num + "@mail.ru"), new Cart(kol));
        }
    }
}
