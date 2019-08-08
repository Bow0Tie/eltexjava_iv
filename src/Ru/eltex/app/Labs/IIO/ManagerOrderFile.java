package Ru.eltex.app.Labs.IIO;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Order;

import java.io.*;
import java.util.LinkedList;

public class ManagerOrderFile extends AManageOrder {
    private static final String ORDERSPATH = "/home/ivan/orders.bin";
    private static final String ORDERPATH = "/home/ivan/order.bin";
    private Main orders;
    private LinkedList<Order> order;

    public ManagerOrderFile(Main orders) {
        this.orders = orders;
        order = orders.getOrders().getOrders();
    }

    @Override
    public void readById(int id) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ORDERPATH))) {
            try {
                while (true) {
                    Order ProveryemiyOrder = (Order) objectInputStream.readObject();
                    if (ProveryemiyOrder.getId() == id) {
                        orders.getOrders().getOrders().add(ProveryemiyOrder);
                    }
                }
            } catch (EOFException e) {
                return;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveById(int id) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ORDERPATH))) {
            for (Order order : order) {
                if (order.getId() == id) {
                    objectOutputStream.writeObject(order);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readAll() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ORDERSPATH))) {
            try {
                while (true) {
                    orders.getOrders().getOrders().add((Order) objectInputStream.readObject());
                }
            } catch (EOFException e) {
                return;
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ORDERSPATH))) {
            for (Order order : order) {
                objectOutputStream.writeObject(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
