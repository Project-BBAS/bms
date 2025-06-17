package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "MESSAGE")
@SQLDelete(sql = "UPDATE message SET delete_flag = true WHERE id = ?")
public class Message extends BaseEntity {

    @Column(name = "VIEW_CNT", nullable = false)
    private Long viewCnt;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "CHAT_ROOM_MEMBER_ID", nullable = false)
    private ChatRoomMember chatRoomMember;
}