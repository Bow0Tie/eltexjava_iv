package Ru.eltex.app.Labs;
import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Order;
import Ru.eltex.app.Labs.Shop.Orders;

import java.util.Random;


public class Generator extends Thread {

    boolean finish = false;
    int i = 0;
    testingarea main = new testingarea();
    Orders localorders = main.getOrders();


    @Override
    public void run() {
        Random rnd = new Random(System.currentTimeMillis());
        while (!finish){
        i++;
        int num = 1 + rnd.nextInt(20000 - 1 + 1);
        localorders.makepurchase(new Credentials(Surname.getSurname(), Imena.getImena(), Otchestva.getOtchestva(), num + "@mail.ru"), new Cart());
        if (i == 10){finish = true;}
        }
    }
}
