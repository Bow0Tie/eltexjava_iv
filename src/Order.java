import java.util.Date;

public class Order {

    private boolean status;
    private Date createtime;
    private Date waittime;

    long a = 0; // Начальное значение диапазона - "от"
    long b = 7200000; // Конечное значение диапазона - "до", 7200000 = 2 часа
    long random_time = a + (long) (Math.random() * b);

    public Order() {
        status = false;
        createtime = new Date();
        waittime = new Date(createtime.getTime() + random_time);
    }
}
