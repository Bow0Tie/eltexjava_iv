package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Coffee;
import Ru.eltex.app.Labs.Napitki;
import Ru.eltex.app.Labs.Tee;

import java.util.*;

public class Cart<T extends Napitki> {

    private List<T> cart = new ArrayList<>();
    private Set<UUID> uuids = new HashSet<>();

    public Cart() {
        cart.add((T) new Coffee());
        cart.add((T) new Coffee());
        cart.add((T) new Tee());
        for(T zapolnyaemiy: cart) {
            uuids.add(zapolnyaemiy.getID());
        }

    }

    public void add(T obj){
        cart.add(obj);
        uuids.add(obj.getID());
        System.out.println(saerch(obj.getID()));
    }
    public void delete(T obj){
        cart.remove(obj);
    }

    public boolean saerch(UUID id){
        return uuids.contains(id);
    }
    public void showcart(){
        for(T etot: cart){
            etot.read();
        }
    }
    public synchronized void zapolnit(){
        for(T zapolnyaemiy: cart) {
            zapolnyaemiy.create();
        }
    }
}
