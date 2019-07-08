package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Surname {
    Gorbatenko,
    Chertkova,
    Ivanov,
    Smirnov,
    Kyznetsov,
    Popov,
    Vasilev,
    Petrov,
    Sokolov;

    public static Surname getSurname() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
