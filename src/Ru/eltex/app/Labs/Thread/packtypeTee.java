package Ru.eltex.app.Labs.Thread;

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
