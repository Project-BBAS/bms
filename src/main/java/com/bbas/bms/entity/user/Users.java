package com.bbas.bms.entity.user;

import com.bbas.bms.domain.user.Role;
import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
@SQLDelete(sql = "UPDATE users SET delete_flag = true WHERE id = ?")
public class Users extends BaseEntity {

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_num", unique = true)
    private String phone_num;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;


}
