package Ru.eltex.app.Labs;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Order;
import Ru.eltex.app.Labs.Shop.Orders;


public class Generator extends Thread {

    boolean finish = false;
    int i = 0;
    testingarea main = new testingarea();
    Orders localorders = main.getOrders();

    @Override
    public void run() {
        while (!finish){
        i++;
        localorders.makepurchase(new Credentials("Gorbatenko","Ivan","Sergeevich","123@mail.ru"), new Cart());
        if (i == 10){finish = true;}
        }
    }

    private void create(){

    }
}
