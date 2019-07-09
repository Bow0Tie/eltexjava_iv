package Ru.eltex.app.Labs;

public class Main {

    private testingarea test = new testingarea();


    public static void main(String[] args) {
       int objectnum = Integer.parseInt(args[0]);
        int i;
        Main main = new Main();
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
        try {
            main.test.tesing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        for(Napitki schitivaemiy: Objects){
//            schitivaemiy.read();
//        }

    }

    public testingarea getTest() {
        return test;
    }

    public void setTest(testingarea test) {
        this.test = test;
    }
}
