public class Coffee extends ClassAbstract {

    public Coffee() {
    }

    @Override
    public void create() {
        count++;
        setName("Jardin");
        setCountry("russia");
        setFirm("ORIMI");
        setPrice((float) 299.99);
    }

    @Override
    public void read() {
        System.out.println("ID товара " + ID + "/nНазвание " + getName() + "/nЦена " + getPrice() + "/n");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

}
