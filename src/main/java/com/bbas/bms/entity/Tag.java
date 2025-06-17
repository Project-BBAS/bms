package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "Tag")
@Entity
@NoArgsConstructor
public class Tag extends BaseEntity{

    @Column(name = "name", nullable = false, unique = true)
    private String name;
}
