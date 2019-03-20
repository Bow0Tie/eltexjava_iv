import java.util.UUID;

public class Coffee extends ClassAbstract {

    private String CoffeeType;
    public Coffee() {
        ID = UUID.randomUUID();
    }

    @Override
    public void create() {
        count++;
        setName("Jardin");
        setCountry("russia");
        setFirm("ORIMI");
        setPrice((float) 299.99);
        CoffeeType = "Arabica";
    }

    @Override
    public void read() {
        System.out.println("ID товара " + ID + "/nНазвание " + getName() + "/nЦена " + getPrice() + "/nСтрана производитель " + getCountry() + "/nФирма " + getFirm());
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}
