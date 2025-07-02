package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "item")
@SQLDelete(sql = "UPDATE item SET delete_flag = true WHERE id = ?")
public class Item extends BaseEntity {

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

    @ManyToOne
    @JoinColumn(name = "ITEM_CATEGORY_ID")
    private ItemCategory itemCategory;

}
