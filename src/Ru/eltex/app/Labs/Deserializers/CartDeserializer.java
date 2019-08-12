package Ru.eltex.app.Labs.Deserializers;

import Ru.eltex.app.Labs.Shop.Cart;
import Ru.eltex.app.Labs.Shop.Coffee;
import Ru.eltex.app.Labs.Shop.Tee;
import com.google.gson.*;

import java.lang.reflect.Type;

public class CartDeserializer implements JsonDeserializer<Cart> {

    @Override
    public Cart deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        Cart cart = new Cart();
        JsonArray cartA = jsonObject.getAsJsonArray("cart");
        for (JsonElement cartElement : cartA) {
            if (cartElement.getAsJsonObject().has("CoffeeType")) {
                cart.add((Coffee) context.deserialize(cartElement, Coffee.class));
            } else {
                cart.add((Tee) context.deserialize(cartElement, Tee.class));
            }
        }
        return cart;
    }
}
