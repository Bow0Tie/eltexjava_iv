package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Imena {
    Ivan,
    Yana,
    Vitya,
    Jenya,
    Alecsander,
    Alecsandra,
    Tatyana,
    Marina,
    Vika,
    Stepan;

    public static Imena getImena() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
