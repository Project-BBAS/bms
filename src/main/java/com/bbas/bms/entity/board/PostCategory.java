package com.bbas.bms.entity.board;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "post_category")
@SQLDelete(sql = "UPDATE post_category SET delete_flag = true WHERE id = ?")
public class PostCategory extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @OneToMany(mappedBy = "postCategory")
    private List<Post> postList;

    public PostCategory(String name) {
        this.name = name;
    }
}