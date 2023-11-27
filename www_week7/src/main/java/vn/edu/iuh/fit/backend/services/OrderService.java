package vn.edu.iuh.fit.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backend.models.Order;
import vn.edu.iuh.fit.backend.repositories.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> findAll(){
        return orderRepository.findAll();
    }
    public List<Order> findOrderByTime(LocalDateTime from,LocalDateTime to){
        return orderRepository.findOrderByOrderDateBetween(from,to);
    }
    public List<Order> findOrderByEmployee(LocalDateTime from,LocalDateTime to,long id){
        return orderRepository.findOrderByOrderDateBetweenAndAndEmployee_Id(from,to,id);
    }
}
