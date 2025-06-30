package com.bbas.bms.entity.board;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "comment")
@SQLDelete(sql = "UPDATE comment SET delete_flag = true WHERE id = ?")
public class Comment extends BaseEntity {

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post postId;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

}