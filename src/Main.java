import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       int objectnum = Integer.parseInt(args[0]);
        int i;
        ArrayList<Napitki> Objects = new ArrayList<>();
        if(args[1] == "Coffee"){
            for (i = 0;i != objectnum;i++){
                Objects.add(new Coffee());
           }
        }
        else{
            for (i = 0;i != objectnum;i++){
                Objects.add(new Tee());
            }
        }
        for(Napitki zapolnyaemiy: Objects) {
            zapolnyaemiy.update();
        }
        for(Napitki schitivaemiy: Objects){
            schitivaemiy.read();
        }
    }
}
