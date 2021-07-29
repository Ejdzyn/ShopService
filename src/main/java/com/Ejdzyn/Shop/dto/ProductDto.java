package com.Ejdzyn.Shop.dto;

import com.Ejdzyn.Shop.enums.Currency;
import lombok.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;
    private Long ean;
    private String productName;
    private int quantity;
    private double price;

    private Currency currency;

}
