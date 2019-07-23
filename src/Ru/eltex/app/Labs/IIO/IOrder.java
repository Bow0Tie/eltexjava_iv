package Ru.eltex.app.Labs.IIO;

import java.util.UUID;

public interface IOrder {
    void readById(int id);

    void saveById(int id);

    void readAll();

    void saveAll();
}
