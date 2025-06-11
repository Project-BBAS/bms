package com.bbas.bms.entity.board;

import com.bbas.bms.entity.BaseEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "POST_CATEGORY")
public class PostCategory extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "postCategory")
    private List<Post> postList;
}