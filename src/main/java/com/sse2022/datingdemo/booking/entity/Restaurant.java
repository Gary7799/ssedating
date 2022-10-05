package com.sse2022.datingdemo.booking.entity;

import com.sse2022.datingdemo.core.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Restaurant extends BaseEntity {
    private String name;

    private Double latitude;

    private Double longitude;

    private String address;
}
