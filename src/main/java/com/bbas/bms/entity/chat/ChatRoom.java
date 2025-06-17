package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "CHAT_ROOM")
@SQLDelete(sql = "UPDATE chat_room SET delete_flag = true WHERE id = ?")
public class ChatRoom extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "IS_GROUP", nullable = false)
    private boolean isGroup;

}