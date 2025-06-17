package com.bbas.bms.entity.user;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "USERS")
@SQLDelete(sql = "UPDATE users SET delete_flag = true WHERE id = ?")
public class Users extends BaseEntity {

    @Column(name = "NICKNAME", nullable = false, unique = true)
    private String nickname;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PHONE_NUM", unique = true)
    private String phone_num;

}
