package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Names {
    Хун_Му_Дань,
    Те_Гуань_Инь,
    Curtis_Isabella_Grape,
    Richard_Royal_Ceylon,
    Бай_Хуа_Сянь_Цзы_Ангел_цветов,
    Молочный_улун,
    Дань_Гуй_Пяо_Сян_с_османтусом,
    Nescafe_Gold,
    Черная_Карта_Gold,
    ЖОКЕЙ_традиционный,
    Московская_кофейня_на_паяхъ;

    public static Names getRandomName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
