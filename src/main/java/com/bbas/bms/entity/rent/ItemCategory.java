package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "item_category")
@SQLDelete(sql = "UPDATE item_category SET delete_flag = true WHERE id = ?")
public class ItemCategory extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "itemCategory")
    private List<Item> itemList;

}