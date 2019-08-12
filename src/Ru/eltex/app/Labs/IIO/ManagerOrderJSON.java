package Ru.eltex.app.Labs.IIO;

import Ru.eltex.app.Labs.Deserializers.CartDeserializer;
import Ru.eltex.app.Labs.Deserializers.OrderDeserializer;
import Ru.eltex.app.Labs.Deserializers.OrdersDeserializer;
import Ru.eltex.app.Labs.Main;
import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Order;
import Ru.eltex.app.Labs.Shop.Orders;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerOrderJSON extends AManageOrder {
    private static final Gson GSON = new GsonBuilder()
//            .setPrettyPrinting()
            .registerTypeAdapter(Cart.class, new CartDeserializer())
            .registerTypeAdapter(Order.class, new OrderDeserializer())
            .registerTypeAdapter(Orders.class, new OrdersDeserializer())
            .create();
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
        try (Scanner scan = new Scanner(new FileReader(ORDERSPATH))) {
            while (scan.hasNextLine()) {
                String json = scan.nextLine();
                orders.getOrders().getOrders().add(GSON.fromJson(json, Order.class));
            }
//            System.out.println(json);
//            Orders result = GSON.fromJson(json.toString(), Orders.class);
//            result.showorders();
//            orders.setOrders(result);
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
