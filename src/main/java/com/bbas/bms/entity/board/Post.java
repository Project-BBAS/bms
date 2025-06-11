package com.bbas.bms.entity.board;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "POST")
public class Post extends BaseEntity {

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "VIEW_CNT", nullable = false)
    private Long viewCnt;

    @Lob
    @Column(name = "CONTENT", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "POST_CATEGORY_ID", nullable = false)
    private PostCategory postCategory;

    @ManyToOne
    @JoinColumn(name = "USERS_ID", nullable = false)
    private Users users;

}