package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "ITEM_CATEGORY")
@SQLDelete(sql = "UPDATE item_category SET delete_flag = true WHERE id = ?")
public class ItemCategory extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "ITEM_CATEGORY")
    private List<Item> itemList;

}