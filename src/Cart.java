import Ru.eltex.app.Labs.Napitki;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Napitki> cart = new ArrayList<>();

    void add(Napitki obj){
        cart.add(obj);
    }
    void delete(Napitki obj){
        cart.remove(obj);
    }
}
