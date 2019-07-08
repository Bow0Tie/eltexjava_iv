package Ru.eltex.app.Labs.Enums;

import java.util.Random;

public enum Otchestva {
    Sergeevich,
    Viktorovna,
    Alecsandrovich,
    Alecsandrovna,
    Sergeevna,
    Viktorovich,
    Stepanovich,
    Stepanovna,
    Andreevna,
    Andreevich;

    public static Otchestva getOtchestva() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
