package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;

@Table(name = "Area")
@Entity
@NoArgsConstructor
public class Area extends BaseEntity{

    @Column(name = "firstAddress", nullable = false)
    private Long firstAddress;

    @Column(name = "secondAddress", nullable = false)
    private Long secondAddress;

    @Column(name = "thirdAddress", nullable = false)
    private Long thirdAddress;


}
