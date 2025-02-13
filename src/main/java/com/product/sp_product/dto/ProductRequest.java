package com.product.sp_product.dto;

import java.math.BigDecimal;

public record ProductRequest(String id, String name, String descrption, BigDecimal price) {

}
