package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Users;
import jakarta.persistence.*;

@Entity
@Table(name = "CHAT_ROOM_MEMBER")
public class ChatRoomMember extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "CHAT_ROOM_ID", nullable = false)
    private ChatRoom chatRoomId;

    @ManyToOne
    @JoinColumn(name = "USERS_ID", nullable = false)
    private Users userId;

}