package vn.edu.iuh.fit.frontend.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backend.models.Order;
import vn.edu.iuh.fit.backend.services.OrderService;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class OrderModel {
    @Autowired
    private OrderService orderService;

    public List<Order> findAll(){
        return orderService.findAll();
    }
    public List<Order> findOrderByTime(LocalDateTime from, LocalDateTime to){
        return orderService.findOrderByTime(from,to);
    }
    public List<Order> findOrderByEmployee(LocalDateTime from, LocalDateTime to,long id){
        return orderService.findOrderByEmployee(from,to,id);
    }
}
