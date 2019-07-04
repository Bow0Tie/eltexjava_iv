package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum packtypeTee {
    Картонная_упаковка,
    Бумажная_упаковка,
    Жестяная_банка,
    Керамическая_банка,
    Деревянная_коробка,
    Полиэтилен;

    public static packtypeTee getRandomPack() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
