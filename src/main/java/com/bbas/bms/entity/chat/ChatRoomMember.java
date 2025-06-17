package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.BaseEntity;
import com.bbas.bms.entity.Users;
import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;

@Entity
@Table(name = "chat_room_member")
@SQLDelete(sql = "UPDATE chat_room_member SET delete_flag = true WHERE id = ?")
public class ChatRoomMember extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "CHAT_ROOM_ID", nullable = false)
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "USERS_ID", nullable = false)
    private Users users;

}