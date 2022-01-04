package com.javatechie.spring.camel.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.javatechie.spring.camel.api.dto.Order;


@Service
public class OrderService {

		private List<Order> list = new ArrayList<>();
		
		
		@PostConstruct
		public void initDB() {
			list.add(new Order(67L, "Mobile", 5000.0));
			list.add(new Order(89L, "Book", 400.0));
			list.add(new Order(45L, "AC", 15000.0));
			list.add(new Order(67L, "Shoes", 4000.0));
		}
		
		
		public List<Order> getOrders(){
			return this.list;
		}

		
		public Order addOrder(Order order) {
			list.add(order);
			return order;
		}
		
		
		public Order DuplicateValue(Order order) {
			Order o = order;
			o.setPrice(order.getPrice()*2);
			
			list.add(o);
			
			return o;
			
		}
		
		
}