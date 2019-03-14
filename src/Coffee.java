public class Coffee extends ClassAbstract {

    @Override
    public void create() {
        count++;

    }

    @Override
    public void read() {
        System.out.println("ID товара " + ID + "/nНазвание " + name + "/nЦена " + price + "/n");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
