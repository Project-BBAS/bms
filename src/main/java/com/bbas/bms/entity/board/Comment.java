package com.bbas.bms.entity.board;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "COMMENT")
public class Comment extends BaseEntity {

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "POST_ID", nullable = false)
    private Post postId;

    @ManyToOne
    @JoinColumn(name = "USERS_ID", nullable = false)
    private Users users;

}
