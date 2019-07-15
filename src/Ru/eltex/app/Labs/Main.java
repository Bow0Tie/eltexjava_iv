package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Shop.Orders;
import Ru.eltex.app.Labs.Thread.ACheckDone;
import Ru.eltex.app.Labs.Thread.ACheckWait;
import Ru.eltex.app.Labs.Thread.Generator;

public class Main {

    private static Orders orders = new Orders();

    private static Generator g1 = new Generator();
    private static Generator g2 = new Generator();
    private static Generator g3 = new Generator();
    private static Generator g4 = new Generator();
    private static ACheckWait w1 = new ACheckWait();
    private static ACheckDone d1 = new ACheckDone();


    public static void main(String[] args) throws InterruptedException {
        int objectnum = Integer.parseInt(args[0]);
        int i;
//        Cart cart2 = new Cart(2);
//        Credentials Yana = new Credentials(Surname.Chertkova, Imena.Yana, Otchestva.Viktorovna, "322@mail.ru");
//        orders.makepurchase(Yana, cart2);
        //Thread wait = new Thread(w1);
        //Thread done = new Thread(d1);
        System.out.println("Сформирован заказ для Яны");
        System.out.println("Запускаем первый генератор");
        g1.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
        g2.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
        g3.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
        g4.start();
        System.out.println("Ждем 1 милисекунд");
        Thread.sleep(1);
        g1.ostonovis();
        g2.ostonovis();
        g3.ostonovis();
        g4.ostonovis();
        Thread.sleep(30000);
        //Thread.sleep(1000);
        System.out.println("Запускаем проверку готовности");
        //orders.showorders();
        w1.start();
        Thread.sleep(5000);
        w1.ostonovis();
//        orders.delete();
        Thread.sleep(1000);
        //orders.showorders();
        //d1.start();
        //wait.start();
        //done.start();



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

    public static Orders getOrders() {
        return orders;
    }

    public static void setOrders(Orders orders) {
        Main.orders = orders;
    }
}
