package pro.sky.java.course2.webstore.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Order {
    private List<Integer> productsId;

    public Order() {
        this.productsId = new ArrayList<>();
    }

    public List<Integer> getProductsId() {
        return productsId;
    }

    public void addProductsId(Integer productId) {
        productsId.add(productId);
    }
}
