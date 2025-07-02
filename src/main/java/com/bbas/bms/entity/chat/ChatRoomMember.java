package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "chat_room_member")
@SQLDelete(sql = "UPDATE chat_room_member SET delete_flag = true WHERE id = ?")
public class ChatRoomMember extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "chat_room_id", nullable = false)
    private ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

}