package com.bbas.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Table(name = "TeamTag")
@Entity
@NoArgsConstructor
public class TeamTag extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id", nullable = false)
    private Tag tag;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "team_id", nullable = false)
//    private Team team;

}
