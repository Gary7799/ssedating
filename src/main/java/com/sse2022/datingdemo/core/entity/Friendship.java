package com.sse2022.datingdemo.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class Friendship extends BaseEntity {

    private Long user1Id;

    private Long user2Id;

    private Integer status;


}
