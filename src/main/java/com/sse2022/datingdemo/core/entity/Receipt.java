package com.sse2022.datingdemo.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Receipt extends BaseEntity {

    private Long hotelId;

    private Long roomId;

    private String title;

    private Integer status;

    private Long startDate;

    private Long endDate;

    private Double totalCharge;


}
