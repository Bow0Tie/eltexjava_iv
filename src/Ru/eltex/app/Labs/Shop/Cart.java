package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Napitki;

import java.util.*;

public class Cart<T extends Napitki> {

    private List<T> cart = new ArrayList<>();
    private Set<UUID> uuids = new HashSet<>();

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
