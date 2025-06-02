package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Item extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "start_date", nullable = false)
    private LocalDateTime start_date;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime end_time;

}
