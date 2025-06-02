package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Users extends BaseEntity{

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_num", unique = true)
    private String phone_num;

}
