package com.bbas.bms.entity.user;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET delete_flag = true WHERE id = ?")
public class Users extends BaseEntity {

    @Column(name = "nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_num", unique = true)
    private String phone_num;

}
