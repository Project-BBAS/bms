package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Item;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;

import java.util.List;

@Entity
@Table(name = "item_category")
@SQLDelete(sql = "UPDATE item_category SET delete_flag = true WHERE id = ?")
public class ItemCategory extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

//    // Item Entity에 itemCategory 필드 필요
//    @OneToMany(mappedBy = "itemCategory")
//    private List<Item> itemList;

}