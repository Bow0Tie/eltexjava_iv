package Ru.eltex.app.Labs.Shop;

import java.sql.Date;
import java.sql.Time;
import java.util.Random;

public class Order {

    private boolean status;
    private Time createtime;
    private Time waittime;

    private Cart cart;
    private Credentials credentials;

    Random rnd = new Random(System.currentTimeMillis());

    long random_time = 1000 + rnd.nextInt(30000 - 1000 + 1);

    public Order(Cart cart, Credentials credentials) {
        status = false;
        createtime = new Time(System.currentTimeMillis());
        waittime = new Time(createtime.getTime() + random_time);
        this.cart = cart;
        this.credentials = credentials;
    }

    public Time getWaittime() {
        return waittime;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void showorder() {
        System.out.println("Статус " + status + "\nВремя создания " + createtime + "\nВремя обработки " + waittime);
        cart.showcart();
        credentials.showcredentials();
    }
}
