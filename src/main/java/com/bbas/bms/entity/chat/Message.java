package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "message")
@SQLDelete(sql = "UPDATE message SET delete_flag = true WHERE id = ?")
public class Message extends BaseEntity {

    @Column(name = "view_cnt", nullable = false)
    private Long viewCnt;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "chat_room_member_id", nullable = false)
    private ChatRoomMember chatRoomMember;
}