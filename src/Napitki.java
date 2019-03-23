import java.util.Scanner;
import java.util.UUID;

abstract public class Napitki implements ICrudAction {
    public static int count;
    protected UUID ID;
    private String name;
    private float price;
    private String firm;
    private String country;
    Scanner sc = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

