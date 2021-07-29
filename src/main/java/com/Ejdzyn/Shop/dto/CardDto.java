package com.Ejdzyn.Shop.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class CardDto {

    private LocalDateTime purchaseTime;

    private List<ProductDto> products;

    private UserDto approvedBy;

}
