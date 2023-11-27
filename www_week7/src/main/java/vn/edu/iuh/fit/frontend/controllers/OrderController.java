package vn.edu.iuh.fit.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backend.models.Employee;
import vn.edu.iuh.fit.backend.models.Order;
import vn.edu.iuh.fit.frontend.models.EmployeeModel;
import vn.edu.iuh.fit.frontend.models.OrderModel;

import java.time.LocalDateTime;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderModel orderModel;
    @Autowired
    private EmployeeModel employeeModel;
    @GetMapping("admin/get_form_order_by_time")
    public String formOrderByTime(){
        return "admin/form_order_by_time";
    }
    @GetMapping("admin/order_by_time")
    public String findOder(Model model, @RequestParam("from")LocalDateTime from, @RequestParam("to")LocalDateTime to){
        List<Order> orders = orderModel.findOrderByTime(from,to);
        model.addAttribute("orders",orders);
        return "admin/order_by_time";
    }
   @GetMapping("admin/get_form_order_by_employee")
   public String formOrderByEmployee(Model model){
        List<Employee> employees = employeeModel.findAll();
        model.addAttribute("employees",employees);
        return "admin/form_order_by_employee";
   }
    @GetMapping("admin/order_by_employee")
    public String findOderByEmployee(Model model, @RequestParam("from")LocalDateTime from, @RequestParam("to")LocalDateTime to,@RequestParam("employee_id") long id){
        List<Order> orders = orderModel.findOrderByEmployee(from,to,id);
        model.addAttribute("orders",orders);
        return "admin/order_by_time";
    }
}
