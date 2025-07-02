package com.bbas.bms.entity.board;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "post")
@SQLDelete(sql = "UPDATE post SET delete_flag = true WHERE id = ?")
public class Post extends BaseEntity {

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "view_cnt", nullable = false)
    private Long viewCnt;

    @Lob
    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "post_category_id", nullable = false)
    private PostCategory postCategory;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

}