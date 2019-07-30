package Ru.eltex.app.Labs.IIO;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Order;

import java.io.*;
import java.util.LinkedList;

public class ManagerOrderFile extends AManageOrder {
    private Main orders;
    private LinkedList<Order> order;

    public ManagerOrderFile(Main orders) {
        this.orders = orders;
        order = orders.getOrders().getOrders();
    }

    @Override
    public void readById(int id) {


    }

    @Override
    public void saveById(int id) {

    }

    @Override
    public void readAll() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/home/ivan/orders.bin"))) {
            while (objectInputStream.readObject() == null) {
                orders.getOrders().getOrders().add((Order) objectInputStream.readObject());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/home/ivan/orders.bin"))) {
            for (Order order : order) {
                objectOutputStream.writeObject(order);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
