package com.home.aws.codebuild.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
	
	private int id;
	private String name;
	private int qty;
	private double price;

}
