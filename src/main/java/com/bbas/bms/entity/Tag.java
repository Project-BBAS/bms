package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Tag extends BaseEntity{

    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
