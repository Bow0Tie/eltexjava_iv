package Ru.eltex.app.Labs.IIO;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Order;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerOrderJSON extends AManageOrder {
    private static final Gson GSON = new GsonBuilder().create();
    private static final String ORDERSPATH = "/home/ivan/orders.json";
    private static final String ORDERPATH = "/home/ivan/order.json";
    private Main orders;
    private LinkedList<Order> order;


    public ManagerOrderJSON(Main orders) {
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
        try (Scanner scanner = new Scanner(new FileReader(ORDERSPATH))) {
            while (scanner.hasNextLine()) {
                Order order = GSON.fromJson(scanner.nextLine(),Order.class);
                orders.getOrders().getOrders().add(order);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveAll() {
        try (FileWriter fileWriter = new FileWriter(ORDERSPATH)) {
            for (Order order : order) {
                String json = GSON.toJson(order);
                fileWriter.write(json + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
