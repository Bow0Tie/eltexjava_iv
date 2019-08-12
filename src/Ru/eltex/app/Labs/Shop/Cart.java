package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Enums.*;

import java.io.Serializable;
import java.util.*;

public class Cart<T extends Napitki> implements Serializable {

    private List<T> cart = new ArrayList<>();
    private transient Set<UUID> uuids = new HashSet<>();


    public Cart() {
    }

    public Cart(int num) {
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < num; i++) {
            float price = 50 + rnd.nextInt(2000 - 50 + 1);
            cart.add((T) new Coffee(CoffeeType.getCoffeeType(), Names.getRandomName(), Country.getRandomCountry(), Firms.getRandomFirms(), price));
            cart.add((T) new Tee(packtypeTee.getRandomPack(), Names.getRandomName(), Country.getRandomCountry(), Firms.getRandomFirms(), price));
        }
        for (T zapolnyaemiy : cart) {
            uuids.add(zapolnyaemiy.getID());
        }
    }

    public void add(T obj) {
        cart.add(obj);
        uuids.add(obj.getID());
        System.out.println(saerch(obj.getID()));
    }

    public void delete(T obj) {
        cart.remove(obj);
    }

    public boolean saerch(UUID id) {
        return uuids.contains(id);
    }

    public void showcart() {
        for (T etot : cart) {
            etot.read();
        }
    }

    public synchronized void zapolnit() {
        for (T zapolnyaemiy : cart) {
            zapolnyaemiy.create();
        }
    }
}
