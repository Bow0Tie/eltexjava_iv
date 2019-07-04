package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Firms {
    Ahmad,
    Riston,
    Greenfield,
    Tess,
    Bernley,
    Curtis,
    Akbar,
    Lavazza,
    Paulig,
    Vergnano,
    Molinari,
    CARRARO;

    public static Firms getRandomFirms() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
