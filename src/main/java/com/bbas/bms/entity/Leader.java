package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "Leader")
@Entity
@NoArgsConstructor
public class Leader extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "team_id")
//    private Team team;

}
