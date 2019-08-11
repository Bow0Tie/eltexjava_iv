package Ru.eltex.app.Labs.IIO;

import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Order;
import Ru.eltex.app.Labs.Shop.Orders;
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
                Orders result = GSON.fromJson(scanner.nextLine(),Orders.class);
                result.showorders();
                orders.setOrders(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveAll() {
        try (FileWriter fileWriter = new FileWriter(ORDERSPATH)) {
            String json = GSON.toJson(orders.getOrders());
            fileWriter.write(json + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
