import java.sql.Date;

public class Order {

    private boolean status;
    private Date createtime;
    private Date waittime;

    private Cart cart;
    private Credentials credentials;

    private long a = 3600000; // Начальное значение диапазона - "от"
    private long b = 7200000; // Конечное значение диапазона - "до", 7200000 = 2 часа
    private long random_time = a + (long) (Math.random() * b);

    public Order(Cart cart, Credentials credentials) {
        status = false;
        createtime = new Date(System.currentTimeMillis());
        waittime = new Date(createtime.getTime() + random_time);
        this.cart = cart;
        this.credentials = credentials;
    }

    public Date getWaittime() {
        return waittime;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
    void showorder(){
        System.out.println("Статус " + status + "\nВремя создания " + createtime + "\nВремя обработки " + waittime);
        cart.showcart();
        credentials.showcredentials();
    }
}
