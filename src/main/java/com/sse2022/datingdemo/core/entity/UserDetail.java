package com.sse2022.datingdemo.core.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class UserDetail extends BaseEntity {

    private Long userId;

    private String address;

    private Integer vaccine;

    private Double height;

}
