package Ru.eltex.app.Labs.Deserializers;

import Ru.eltex.app.Labs.Shop.Order;
import Ru.eltex.app.Labs.Shop.Orders;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;

public class OrdersDeserializer implements JsonDeserializer<Orders> {
    @Override
    public Orders deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        Orders orders = new Orders();
        JsonObject jsonObject = json.getAsJsonObject();
        for(Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            Order order = context.deserialize(entry.getValue(), Order.class);
            orders.add(order);
        }
        return orders;
    }
}
