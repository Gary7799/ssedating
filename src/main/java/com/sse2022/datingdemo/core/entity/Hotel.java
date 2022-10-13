package com.sse2022.datingdemo.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Hotel extends BaseEntity {

    private String title;

    private String address;

    private Integer tele;

    private String email;

    private Double score;

    private Integer status;


}
