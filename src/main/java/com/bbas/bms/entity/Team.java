package com.bbas.bms.entity;

import jakarta.persistence.*;

import java.awt.geom.Area;
import java.time.LocalDateTime;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.SoftDelete;

@Entity
@Table(name = "team")
@SoftDelete
@NoArgsConstructor
public class Team extends BaseEntity{

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "logo", columnDefinition = "BLOB")
    private byte[] logo;

    @Column(name = "contents")
    private String contents;

    // TODO: 25. 6. 12. 김광오 : Area 엔티티와 병합
    //   @ManyToOne
    //   @JoinColumn(name = "area_id", nullable = false)
    //   private Area area;



}
