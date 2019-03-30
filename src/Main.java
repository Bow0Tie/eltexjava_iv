import Ru.eltex.app.Labs.Coffee;
import Ru.eltex.app.Labs.Napitki;
import Ru.eltex.app.Labs.Tee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       int objectnum = Integer.parseInt(args[0]);
        int i;
        //ArrayList<Napitki> Objects = new ArrayList<>();
        Cart cart = new Cart();
        if(args[1].equals("Coffee")){
            for (i = 0;i != objectnum;i++){
                cart.add(new Coffee());
           }
        }
        else if(args[1].equals("Tee")){
            for (i = 0;i != objectnum;i++){
                cart.add(new Tee());
            }
        }
//        for(Napitki zapolnyaemiy: Objects) {
//            zapolnyaemiy.update();
//        }
//        for(Napitki schitivaemiy: Objects){
//            schitivaemiy.read();
//        }

    }
}
