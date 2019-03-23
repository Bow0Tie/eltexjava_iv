package Ru.eltex.app.Labs;

import java.util.UUID;

public class Coffee extends Napitki {

    private String CoffeeType;
    public Coffee() {
        ID = UUID.randomUUID();
    }

    public Coffee(String coffeeType,String name,String country,String firm, float price) {
        CoffeeType = coffeeType;
        setName(name);
        setCountry(country);
        setFirm(firm);
        setPrice(price);
        ID = UUID.randomUUID();
    }

    @Override
    public void create() {
        Napitki.count++;
        setName("Jardin");
        setCountry("russia");
        setFirm("ORIMI");
        setPrice(299.99f);
        CoffeeType = "Arabica";
    }

    @Override
    public void read() {
        System.out.println("ID товара " + ID + "\nНазвание " + getName() + "\nЦена " + getPrice() + "\nСтрана производитель " + getCountry() + "\nФирма " + getFirm() + "\nТип зерен " + CoffeeType);
    }

    @Override
    public void update() {
        System.out.println("Введите название");
        setName(sc.nextLine());
        System.out.println("Страна производитель");
        setCountry(sc.nextLine());
        System.out.println("Фирма производитель");
        setFirm(sc.nextLine());
        System.out.println("Цена кофе");
        setPrice(sc.nextFloat());
        sc.nextLine();
        System.out.println("Тип кофейных зерен");
        CoffeeType = sc.nextLine();
    }

    @Override
    public void delete() {
        Napitki.count--;
        setName(null);
        setCountry(null);
        setFirm(null);
        setPrice(0f);
        CoffeeType = null;
    }

}
