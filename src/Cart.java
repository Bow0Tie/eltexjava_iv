import Ru.eltex.app.Labs.Napitki;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;

public class Cart {

    private ArrayList<Napitki> cart = new ArrayList<>();
    private HashSet<UUID> uuids = new HashSet<>();

    void add(Napitki obj){
        cart.add(obj);
        uuids.add(obj.getID());
    }
    void delete(Napitki obj){
        cart.remove(obj);
    }

    String saerch(UUID id){
        for(UUID uuid: uuids){
            if (uuid.equals(id)){
                return("Имеется");
            }
            else {
                return("Нету");
            }
        }
    return ("jopa");
    }
    void showALL(){
        for(Napitki etot: cart){
            etot.read();
        }
    }
}
