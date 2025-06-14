package com.bbas.bms.entity.board;

import com.bbas.bms.entity.BaseEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;

import java.util.List;

@Entity
@Table(name = "post_category")
@SQLDelete(sql = "UPDATE post_category SET delete_flag = true WHERE id = ?")
public class PostCategory extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "postCategory")
    private List<Post> postList;
}