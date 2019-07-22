package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Shop.Orders;
import Ru.eltex.app.Labs.Thread.ACheckDone;
import Ru.eltex.app.Labs.Thread.ACheckWait;
import Ru.eltex.app.Labs.Thread.Generator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static Orders orders = new Orders();


    public static void main(String[] args) throws InterruptedException {
//        int objectnum = Integer.parseInt(args[0]);
//        int i;
//        Cart cart2 = new Cart(2);
//        Credentials Yana = new Credentials(Surname.Chertkova, Imena.Yana, Otchestva.Viktorovna, "322@mail.ru");
//        orders.makepurchase(Yana, cart2);

        ExecutorService executor1 = Executors.newCachedThreadPool();
        ExecutorService executor2 = Executors.newCachedThreadPool();
        Main main = new Main();
        Generator g1 = new Generator(main);
        Generator g2 = new Generator(main);
        Generator g3 = new Generator(main);
        Generator g4 = new Generator(main);
        //Thread done = new Thread(d1);
        //g1.start();
        executor1.execute(g1);
        Thread.sleep(1000);
        executor1.execute(g2);
        //g2.start();
        Thread.sleep(1000);
        executor1.execute(g3);
        //g3.start();
        Thread.sleep(1000);
        executor1.execute(g4);
        //g4.start();
        Thread.sleep(1001);
        executor1.shutdownNow();
        System.out.println("были выключены генераторы");
//        g1.ostonovis();
//        g2.ostonovis();
//        g3.ostonovis();
//        g4.ostonovis();
        Thread.sleep(30000);
        //Thread.sleep(1000);
        System.out.println("Запускаем проверку готовности");
        //orders.showorders();
        ACheckWait w1 = new ACheckWait(main);
        executor2.execute(w1);
        Thread.sleep(5000);
        ACheckDone d1 = new ACheckDone(main);
        executor2.execute(d1);
        Thread.sleep(5000);
        executor2.shutdownNow();
        orders.showorders();
//        orders.delete();
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

    public synchronized Orders getOrders() {
        return orders;
    }

    public synchronized void setOrders(Orders orders) {
        Main.orders = orders;
    }
}
