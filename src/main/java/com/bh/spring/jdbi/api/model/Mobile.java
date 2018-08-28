package com.bh.spring.jdbi.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {
	private int id;
	private String model_name;
	private int price;
}
