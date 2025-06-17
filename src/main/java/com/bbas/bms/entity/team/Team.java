package com.bbas.bms.entity.team;

import com.bbas.bms.entity.common.Area;
import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "TEAM")
@SQLDelete(sql = "UPDATE team SET delete_flag = true WHERE id = ?")
public class Team extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    private String name;

    @Lob
    @Column(name = "LOGO", columnDefinition = "BLOB")
    private byte[] logo;

    @Column(name = "CONTENTS")
    private String contents;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AREA_ID", nullable = false)
    private Area area;



}
