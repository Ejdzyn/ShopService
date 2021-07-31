package com.Ejdzyn.Shop.entity;

import com.Ejdzyn.Shop.enums.Currency;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private Long ean;

    @Column(unique = true,nullable = false)
    private String productName;

    @Column(columnDefinition = "integer default 0")
    private int quantity;

    @Column(columnDefinition = "decimal default 0")
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar default 'PLN'",length = 3)
    private Currency currency;



}
