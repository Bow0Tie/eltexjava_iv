
import java.util.LinkedList;

public class Orders {

    private LinkedList<Order> Orders = new LinkedList<>();

    void makepurchase(Credentials credentials, Cart cart) {

        Orders.add(new Order(cart, credentials));
    }
    void complitecheck(){
        for(Order order: Orders){
            if (System.currentTimeMillis() >= order.getWaittime().getTime()){
                order.setStatus(true);
            }
        }
    }
    void delete(){
        for(Order order: Orders){
            if (order.isStatus()){
                Orders.remove();
            }
        }
    }
    void showorders(){
        for (Order tyt: Orders){
            tyt.showorder();
        }
    }
}
