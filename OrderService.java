package Medhis.IDE.IDE.service;

import Medhis.IDE.IDE.model.Order;
import Medhis.IDE.IDE.repository.OrderRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public Long createOrder(Order order) {
        Order savedOrder = orderRepository.save(order);
        return savedOrder.getRegId();
    }
}
