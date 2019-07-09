package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Orders;

public class Main {

    private static Orders orders = new Orders();

    private static Generator g1 = new Generator();
    private static Generator g2 = new Generator();
    private static Generator g3 = new Generator();
    private static Generator g4 = new Generator();


    public static void main(String[] args) throws InterruptedException {
        int objectnum = Integer.parseInt(args[0]);
        int i;
        Cart cart2 = new Cart(2);
        Credentials Yana = new Credentials(Surname.Chertkova, Imena.Yana, Otchestva.Viktorovna, "322@mail.ru");
        orders.makepurchase(Yana, cart2);
        System.out.println("Сформирован заказ для Яны");
        System.out.println("Запускаем первый генератор");
        g1.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
        g1.ostonovis();
        orders.showorders();
//        if(args[1].equals("Coffee")){
//            for (i = 0;i != objectnum;i++){
//                test.cart1.add(new Coffee());
//           }
//        }
//        else if(args[1].equals("Tee")){
//            for (i = 0;i != objectnum;i++){
//                test.cart1.add(new Tee());
//            }
//        }
//        if(args[1].equals("Tee")){
//            for (i = 0;i != objectnum;i++){
//                test.cart2.add(new Coffee());
//            }
//        }
//        else if(args[1].equals("Coffee")){
//            for (i = 0;i != objectnum;i++){
//                test.cart2.add(new Tee());
//            }
//        }
//        try {
//            test.tesing();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        for(Napitki schitivaemiy: Objects){
//            schitivaemiy.read();
//        }

    }

    public static synchronized Orders getOrders() {
        return orders;
    }

    public static synchronized void setOrders(Orders orders) {
        Main.orders = orders;
    }
}
