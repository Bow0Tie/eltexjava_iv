package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.IIO.ManagerOrderFile;
import Ru.eltex.app.Labs.Shop.Orders;
import Ru.eltex.app.Labs.Thread.ACheckDone;
import Ru.eltex.app.Labs.Thread.ACheckWait;
import Ru.eltex.app.Labs.Thread.Generator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    private static Orders orders = new Orders();


    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor1 = Executors.newCachedThreadPool();
        ExecutorService executor2 = Executors.newCachedThreadPool();
        Main main = new Main();
        Generator g1 = new Generator(main);
        Generator g2 = new Generator(main);
        Generator g3 = new Generator(main);
        Generator g4 = new Generator(main);
        ManagerOrderFile save = new ManagerOrderFile(main);
//        executor1.execute(g1);
//        Thread.sleep(1000);
//        executor1.execute(g2);
//        Thread.sleep(1000);
//        executor1.execute(g3);
//        Thread.sleep(1000);
//        executor1.execute(g4);
//        Thread.sleep(1001);
//        executor1.shutdownNow();
//        System.out.println("были выключены генераторы");
//        Thread.sleep(5000);
//        System.out.println("Запускаем проверку готовности");
//        ACheckWait w1 = new ACheckWait(main);
//        executor2.execute(w1);
//        Thread.sleep(5000);
//        ACheckDone d1 = new ACheckDone(main);
//        executor2.execute(d1);
//        Thread.sleep(5000);
//        executor2.shutdownNow();
//        orders.showorders();
//        save.saveAll();
        save.readAll();
        orders.showorders();
    }

    public synchronized Orders getOrders() {
        return orders;
    }

}
