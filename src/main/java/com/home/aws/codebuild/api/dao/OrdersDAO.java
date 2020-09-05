package com.home.aws.codebuild.api.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.home.aws.codebuild.api.model.Order;

public class OrdersDAO {

	public List<Order> getOrders() {
		return Stream
				.of(new Order(101, "Mobile", 2, 24000), new Order(102, "Samsung", 4, 26000),
						new Order(103, "TV", 1, 21000), new Order(104, "Washing Machine", 1, 12000))
				.collect(Collectors.toList());

	}

}
