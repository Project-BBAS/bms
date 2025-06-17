package com.bbas.bms.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "match")
@NoArgsConstructor
public class Match extends BaseEntity{

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "status", nullable = false, length = 10)
    private String status;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Lob
    @Column(name = "contents", columnDefinition = "CLOB")
    private byte[] contents;

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
