package com.bbas.bms.entity.board;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "POST")
@SQLDelete(sql = "UPDATE post SET delete_flag = true WHERE id = ?")
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