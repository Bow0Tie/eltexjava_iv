package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Enums.Firms;
import Ru.eltex.app.Labs.Enums.Names;
import Ru.eltex.app.Labs.Enums.packtypeTee;
import Ru.eltex.app.Labs.Enums.Country;

import java.util.Random;
import java.util.UUID;


public class Tee extends Napitki {
    private packtypeTee PackType;

    public Tee() {
        PackType = packtypeTee.getRandomPack();
        setName(Names.getRandomName());
        setCountry(Country.getRandomCountry());
        setFirm(Firms.getRandomFirms());
        Random rnd = new Random(System.currentTimeMillis());
        float price = 50 + rnd.nextInt(2000 - 50 + 1);
        setPrice(price);
        ID = UUID.randomUUID();
    }

    public Tee(packtypeTee packtype, Names name, Country country, Firms firm, float price) {
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
        setName(Names.Бай_Хуа_Сянь_Цзы_Ангел_цветов);
        setCountry(Country.Вьетнам);
        setFirm(Firms.Tess);
        setPrice(199.99f);
        PackType = packtypeTee.Бумажная_упаковка;
    }

    @Override
    public void read() {
        System.out.println("ID товара: " + ID + "\nНазвание: " + getName() + "\nЦена: " + getPrice() + "\nСтрана производитель: " + getCountry() + "\nФирма: " + getFirm() + "\nТип упаковки: " + PackType);
    }

    @Override
    public void update() {
//        System.out.println("Введите название");
//        setName(sc.nextLine());
//        System.out.println("Страна производитель");
//        setCountry(sc.nextLine());
//        System.out.println("Фирма производитель");
//        setFirm(sc.nextLine());
//        System.out.println("Цена чая");
//        setPrice(sc.nextFloat());
//        sc.nextLine();
//        System.out.println("Тип упаковки");
//        PackType = sc.nextLine();
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

