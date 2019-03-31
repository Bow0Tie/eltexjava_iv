import Ru.eltex.app.Labs.Coffee;
import Ru.eltex.app.Labs.Tee;

import java.util.UUID;

public class testingarea {

    Cart cart1 = new Cart();
    Cart cart2 = new Cart();
    Credentials Ivan = new Credentials("Gorbatenko","Ivan","Sergeevich","123@mail.ru");
    Credentials Yana = new Credentials("Chertkova","Yana","Viktorovna","322@mail.ru");
    Orders orders = new Orders();
    UUID searchID = UUID.randomUUID();

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
        cart1.saerch(searchID);
    }
}
