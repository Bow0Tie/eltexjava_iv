package Ru.eltex.app.Labs.Deserializers;

import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Credentials;
import Ru.eltex.app.Labs.Shop.Order;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.sql.Time;

public class OrderDeserializer implements JsonDeserializer<Order> {
    @Override
    public Order deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Order order = new Order((Cart) context.deserialize(jsonObject.get("cart"), Cart.class), (Credentials) context.deserialize(jsonObject.get("credentials"), Credentials.class));
        order.setStatus(jsonObject.get("status").getAsBoolean());
        order.setCreatetime((Time) context.deserialize(jsonObject.get("createtime"), Time.class));
        order.setWaittime((Time) context.deserialize(jsonObject.get("waittime"), Time.class));
        order.setId(jsonObject.get("id").getAsInt());
        return order;
    }
}
