package com.product.sp_product;

import org.springframework.boot.SpringApplication;

public class TestSpProductApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpProductApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
