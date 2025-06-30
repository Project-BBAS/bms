package com.bbas.bms.entity.team;

import com.bbas.bms.entity.common.Area;
import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;

import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "team")
@SQLDelete(sql = "UPDATE team SET delete_flag = true WHERE id = ?")
public class Team extends BaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "logo", columnDefinition = "bytea")
    private byte[] logo;


    @Column(name = "contents")
    private String contents;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id", nullable = false)
    private Area area;



}
