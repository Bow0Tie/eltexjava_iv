package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Enums.Country;
import Ru.eltex.app.Labs.Enums.Firms;
import Ru.eltex.app.Labs.Enums.Names;
import Ru.eltex.app.Labs.Shop.ICrudAction;

import java.io.Serializable;
import java.util.UUID;

abstract class Napitki implements ICrudAction, Serializable {
    static int count;
    UUID ID;
    private Names name;
    private float price;
    private Firms firm;
    private Country country;

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

