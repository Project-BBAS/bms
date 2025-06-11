package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "MESSAGE")
public class Message extends BaseEntity {

    @Column(name = "VIEW_CNT", nullable = false)
    private Long viewCnt;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "CHAT_ROOM_MEMBER_ID", nullable = false)
    private ChatRoomMember chatRoomMember;
}