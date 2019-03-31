import Ru.eltex.app.Labs.Coffee;
import Ru.eltex.app.Labs.Tee;

public class testingarea {

    Cart cart1 = new Cart();
    Cart cart2 = new Cart();
    Credentials Ivan = new Credentials("Gorbatenko","Ivan","Sergeevich","123@mail.ru");
    Credentials Yana = new Credentials("Chertkova","Yana","Viktorovna","322@mail.ru");
    Order orderIvan = new Order(cart1,Ivan);
    Order orderYana = new Order(cart2,Yana);


}
