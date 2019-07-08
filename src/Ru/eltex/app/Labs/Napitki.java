package Ru.eltex.app.Labs;

import Ru.eltex.app.Labs.Enums.Country;
import Ru.eltex.app.Labs.Enums.Firms;
import Ru.eltex.app.Labs.Enums.Names;

import java.util.Scanner;
import java.util.UUID;

abstract public class Napitki implements ICrudAction {
    public static int count;
    protected UUID ID;
    private Names name;
    private float price;
    private Firms firm;
    private Country country;
    //Scanner sc = new Scanner(System.in);
    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Firms getFirm() {
        return firm;
    }

    public void setFirm(Firms firm) {
        this.firm = firm;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public UUID getID() {
        return ID;
    }
}

