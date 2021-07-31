package com.Ejdzyn.Shop.entity;

import lombok.*;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Cart implements Serializable {

    @Id
    private Long id;

}
