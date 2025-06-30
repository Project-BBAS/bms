package com.bbas.bms.entity.team;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "team_member")
@SQLDelete(sql = "UPDATE team_member SET delete_flag = true WHERE id = ?")
public class TeamMember extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

}
