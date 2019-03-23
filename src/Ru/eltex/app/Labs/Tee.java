package Ru.eltex.app.Labs;

import java.util.UUID;

public class Tee extends Napitki {
    private String PackType;
    public Tee() {
        ID = UUID.randomUUID();
    }

    public Tee(String packtype,String name,String country,String firm, float price) {
        PackType = packtype;
        setName(name);
        setCountry(country);
        setFirm(firm);
        setPrice(price);
        ID = UUID.randomUUID();
    }

    @Override
    public void create() {
        count++;
        setName("Tess");
        setCountry("russia");
        setFirm("ORIMI");
        setPrice(199.99f);
        PackType = "vacuum";
    }

    @Override
    public void read() {
        System.out.println("ID товара " + ID + "\nНазвание " + getName() + "\nЦена " + getPrice() + "\nСтрана производитель " + getCountry() + "\nФирма " + getFirm() + "\nТип упаковки " + PackType);
    }

    @Override
    public void update() {
        System.out.println("Введите название");
        setName(sc.nextLine());
        System.out.println("Страна производитель");
        setCountry(sc.nextLine());
        System.out.println("Фирма производитель");
        setFirm(sc.nextLine());
        System.out.println("Цена чая");
        setPrice(sc.nextFloat());
        sc.nextLine();
        System.out.println("Тип упаковки");
        PackType = sc.nextLine();
    }

    @Override
    public void delete() {
        count--;
        setName(null);
        setCountry(null);
        setFirm(null);
        setPrice(0f);
        PackType = null;
    }
}

