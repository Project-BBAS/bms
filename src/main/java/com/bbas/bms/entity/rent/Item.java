package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "ITEM")
@SQLDelete(sql = "UPDATE item SET delete_flag = true WHERE id = ?")
public class Item extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "TYPE", nullable = false)
    private String type;

    @Column(name = "PRICE", nullable = false)
    private int price;

    @Column(name = "START_DATE", nullable = false)
    private LocalDateTime start_date;

    @Column(name = "END_TIME", nullable = false)
    private LocalDateTime end_time;

}
