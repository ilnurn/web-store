package pro.sky.java.course2.webstore.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.webstore.data.Order;

import java.util.List;

@Service
public class OrderService {
    private final Order order;

    public OrderService(Order order) {
        this.order = order;
    }
    public void addProductsId(String productsId) {
        String[] arrayProductsId = productsId.split(",");
        for (String stringNumberId : arrayProductsId) {
            Integer numberId = Integer.valueOf(stringNumberId);
            order.addProductsId(numberId);
        }
    }

    public List<Integer> getProductsId() {
        return order.getProductsId();
    }
}
