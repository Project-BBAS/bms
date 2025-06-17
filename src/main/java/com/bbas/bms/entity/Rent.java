package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;

@Table(name = "Rent")
@Entity
@NoArgsConstructor
public class Rent extends BaseEntity{

    @Column(name = "start_date", nullable = false)
    private LocalDateTime start_date;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;
}
