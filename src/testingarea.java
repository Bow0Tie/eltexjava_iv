import Shop.Cart;
import Shop.Credentials;
import Shop.Generator;
import Shop.Orders;

import java.util.UUID;

public class testingarea {

    Cart cart1 = new Cart();
    Cart cart2 = new Cart();
    Credentials Ivan = new Credentials("Gorbatenko","Ivan","Sergeevich","123@mail.ru");
    Credentials Yana = new Credentials("Chertkova","Yana","Viktorovna","322@mail.ru");
    Orders orders = new Orders();
    UUID searchID = UUID.randomUUID();
    Generator g1 = new Generator();
    Generator g2 = new Generator();
    Generator g3 = new Generator();
    Generator g4 = new Generator();

    void tesing(){
        cart1.zapolnit();
        System.out.println("Заполнилась первая карзина");
        cart2.zapolnit();
        System.out.println("Заполнилась вторая карзина");
        orders.makepurchase(Yana,cart2);
        System.out.println("Сформирован заказ для Яны");
        orders.makepurchase(Ivan,cart1);
        System.out.println("Сформирован заказ для Ивана");
        orders.complitecheck();
        System.out.println("Выполнена проверка на готовность");
        orders.delete();
        System.out.println("Удалены готовые");
        orders.showorders();
        System.out.println(cart1.saerch(searchID));
        g1.start();
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
