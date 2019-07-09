package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Orders;
import java.util.UUID;

public class testingarea {

    Cart cart1 = new Cart(2);
    Cart cart2 = new Cart(2);
    Credentials Ivan = new Credentials(Surname.Gorbatenko, Imena.Ivan, Otchestva.Sergeevich,"123@mail.ru");
    Credentials Yana = new Credentials(Surname.Chertkova, Imena.Yana, Otchestva.Viktorovna,"322@mail.ru");
    private Orders orders = new Orders();
    UUID searchID = UUID.randomUUID();
    private static Generator g1 = new Generator();
    private static Generator g2 = new Generator();
    private static Generator g3 = new Generator();
    private static Generator g4 = new Generator();

    void tesing() throws InterruptedException {
//        cart1.zapolnit();
//        System.out.println("Заполнилась первая карзина");
//        cart2.zapolnit();
//        System.out.println("Заполнилась вторая карзина");
        orders.makepurchase(Yana,cart2);
        System.out.println("Сформирован заказ для Яны");
//        orders.makepurchase(Ivan,cart1);
//        System.out.println("Сформирован заказ для Ивана");
//        orders.complitecheck();
//        System.out.println("Выполнена проверка на готовность");
//        orders.delete();
//        System.out.println("Удалены готовые");
//        orders.showorders();
//        System.out.println(cart1.saerch(searchID));
        System.out.println("Запускаем первый генератор");
        g1.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
//        System.out.println("Запускаем второй генератор");
//        g2.start();
//        System.out.println("Ждем 1 милисекунд");
//        Thread.sleep(2);
//        System.out.println("Запускаем третий генератор");
//        g3.start();
//        System.out.println("Ждем 1 милисекунд");
//        Thread.sleep(2);
//        System.out.println("Запускаем четвертый генератор");
//        g4.start();
//        System.out.println("Ждем 1 милисекунд");
//        Thread.sleep(2);
        g1.ostonovis();
//        g2.ostonovis();
//        g3.ostonovis();
//        g4.ostonovis();
//        orders.showorders();

    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
