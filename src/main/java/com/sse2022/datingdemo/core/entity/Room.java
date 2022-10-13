package com.sse2022.datingdemo.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Room extends BaseEntity {

    private Long hotelId;

    private String title;

    private Integer status;

    private Double charge;

    private Integer amount;


}
