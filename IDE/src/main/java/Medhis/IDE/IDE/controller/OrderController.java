package Medhis.IDE.IDE.controller;

import Medhis.IDE.IDE.model.Order;
import Medhis.IDE.IDE.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Long createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
