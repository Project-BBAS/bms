package com.bbas.bms.entity.chat;

import com.bbas.bms.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "CHAT_ROOM")
public class ChatRoom extends BaseEntity {

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "IS_GROUP", nullable = false)
    private boolean isGroup;

}