package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {
    public List<Order> findOrderByOrderDateBetween(LocalDateTime orderDate, LocalDateTime orderDate2);
    public List<Order> findOrderByOrderDateBetweenAndAndEmployee_Id(LocalDateTime orderDate, LocalDateTime orderDate2,long id);
}
