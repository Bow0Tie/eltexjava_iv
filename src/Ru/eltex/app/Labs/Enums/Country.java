package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Country {
    Индия,
    Китай,
    Шри_Ланка,
    Япония,
    Индонезия,
    Вьетнам,
    Кения,
    Турция,
    Бразилия,
    Колумбия;

    public static Country getRandomCountry() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
