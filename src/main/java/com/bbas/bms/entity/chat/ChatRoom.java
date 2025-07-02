package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "chat_room")
@SQLDelete(sql = "UPDATE chat_room SET delete_flag = true WHERE id = ?")
public class ChatRoom extends BaseEntity {

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "is_group", nullable = false)
    private boolean isGroup;

}