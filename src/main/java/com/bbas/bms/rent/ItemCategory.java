package com.bbas.bms.rent;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Item;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ITEM_CATEGORY")
public class ItemCategory extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

//    // Item Entity에 itemCategory 필드 필요
//    @OneToMany(mappedBy = "itemCategory")
//    private List<Item> itemList;

}