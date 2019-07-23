package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Enums.*;

import java.util.Random;
import java.util.UUID;

public class Coffee extends Napitki {
    private CoffeeType CoffeeType;

    public Coffee() {
        CoffeeType = Ru.eltex.app.Labs.Enums.CoffeeType.getCoffeeType();
        setName(Names.getRandomName());
        setCountry(Country.getRandomCountry());
        setFirm(Firms.getRandomFirms());
        Random rnd = new Random(System.currentTimeMillis());
        float price = 50 + rnd.nextInt(2000 - 50 + 1);
        setPrice(price);
        ID = UUID.randomUUID();
    }

    public Coffee(CoffeeType coffeeType, Names name, Country country, Firms firm, float price) {
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
        setName(Names.ЖОКЕЙ_традиционный);
        setCountry(Country.Бразилия);
        setFirm(Firms.Molinari);
        setPrice(299.99f);
        CoffeeType = Ru.eltex.app.Labs.Enums.CoffeeType.Арабика;
    }

    @Override
    public void read() {
        System.out.println("ID товара: " + ID + "\nНазвание: " + getName() + "\nЦена: " + getPrice() + "\nСтрана производитель: " + getCountry() + "\nФирма: " + getFirm() + "\nТип зерен: " + CoffeeType);
    }

    @Override
    public void update() {
//        System.out.println("Введите название");
//        setName(sc.nextLine());
//        System.out.println("Страна производитель");
//        setCountry(sc.nextLine());
//        System.out.println("Фирма производитель");
//        setFirm(sc.nextLine());
//        System.out.println("Цена кофе");
//        setPrice(sc.nextFloat());
//        sc.nextLine();
//        System.out.println("Тип кофейных зерен");
//        CoffeeType = sc.nextLine();
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
