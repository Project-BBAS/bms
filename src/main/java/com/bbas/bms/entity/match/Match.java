package com.bbas.bms.entity.match;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.court.Court;
import com.bbas.bms.entity.team.Team;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "MATCH")
@SQLDelete(sql = "UPDATE match SET delete_flag = true WHERE id = ?")
public class Match extends BaseEntity {

    @Column(name = "TITLE", nullable = false, length = 100)
    private String title;

    @Column(name = "STATUS", nullable = false, length = 10)
    private String status;

    @Column(name = "START_TIME", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "END_TIME", nullable = false)
    private LocalDateTime endTime;

    @Lob
    @Column(name = "CONTENTS", columnDefinition = "CLOB")
    private byte[] contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HOME_TEAM_ID", nullable = false)
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AWAY_TEAM_ID", nullable = false)
    private Team awayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "court_id", nullable = false)
    private Court court;
}
