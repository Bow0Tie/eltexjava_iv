
import java.util.LinkedList;
import java.util.List;

public class Orders {

    private LinkedList<Order> Orders = new LinkedList<>();

    private void makepurchase(Credentials credentials, Cart cart) {
        Orders.add(new Order(cart, credentials));
    }
    private void complitecheck(){
        for(Order order: Orders){
            if (order.getWaittime().getTime() > System.currentTimeMillis()){
                order.setStatus(true);
            }
        }
    }
    private void delete(){
        for(Order order: Orders){
            if (order.isStatus()){
                Orders.remove();
            }
        }
    }
}
