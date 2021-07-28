package com.Ejdzyn.Shop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class StocktakingDto {

    private LocalDateTime StockingDate;

}
