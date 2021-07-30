package com.Ejdzyn.Shop.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stocking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
