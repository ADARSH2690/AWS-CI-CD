package com.home.aws.codebuild.api;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.home.aws.codebuild.api.dao.OrdersDAO;
import com.home.aws.codebuild.api.model.Order;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class SpringbootAwsCiCdCodeBuildApplication {
	
	@Autowired
	private OrdersDAO ordersDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsCiCdCodeBuildApplication.class, args);
	}
	
	@GetMapping
	public List<Order> getAllOrders(){
		return ordersDAO.getOrders().stream().sorted(Comparator.comparing(Order::getPrice))
				.collect(Collectors.toList());
	}

}
