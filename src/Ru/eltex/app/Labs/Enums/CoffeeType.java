package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum CoffeeType {
    Арабика,
    Робуста,
    Либерика,
    Эксцельза;

    public static CoffeeType getCoffeeType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
