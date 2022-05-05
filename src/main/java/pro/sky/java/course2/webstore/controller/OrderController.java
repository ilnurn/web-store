package pro.sky.java.course2.webstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webstore.service.OrderService;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String hello(){
        return "Добро пожаловать в магазин";
    }

    @GetMapping("/add")
    public void addProducts(@RequestParam String productsId){
        orderService.addProductsId(productsId);
    }

    @GetMapping("/get")
    public List<Integer> getProducts(){
        return orderService.getProductsId();
    }
}
