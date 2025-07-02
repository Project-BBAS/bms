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
@Table(name = "match")
@SQLDelete(sql = "UPDATE match SET delete_flag = true WHERE id = ?")
public class Match extends BaseEntity {

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "contents",columnDefinition = "TEXT")
    private String contents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_team_id", nullable = false)
    private Team homeTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_team_id", nullable = false)
    private Team awayTeam;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "court_id", nullable = false)
    private Court court;
}
