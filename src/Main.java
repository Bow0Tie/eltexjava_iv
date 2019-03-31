import Ru.eltex.app.Labs.Coffee;
import Ru.eltex.app.Labs.Napitki;
import Ru.eltex.app.Labs.Tee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       int objectnum = Integer.parseInt(args[0]);
        int i;
        testingarea test = new testingarea();
        if(args[1].equals("Coffee")){
            for (i = 0;i != objectnum;i++){
                test.cart1.add(new Coffee());
           }
        }
        else if(args[1].equals("Tee")){
            for (i = 0;i != objectnum;i++){
                test.cart1.add(new Tee());
            }
        }
        if(args[1].equals("Tee")){
            for (i = 0;i != objectnum;i++){
                test.cart2.add(new Coffee());
            }
        }
        else if(args[1].equals("Coffee")){
            for (i = 0;i != objectnum;i++){
                test.cart2.add(new Tee());
            }
        }
        for(Napitki zapolnyaemiy: test.cart1.) {
            zapolnyaemiy.create();
        }
//        for(Napitki schitivaemiy: Objects){
//            schitivaemiy.read();
//        }

    }
}
