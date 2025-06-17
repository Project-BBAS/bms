package com.bbas.bms.entity.team;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "TAG")
@SQLDelete(sql = "UPDATE tag SET delete_flag = true WHERE id = ?")
public class Tag extends BaseEntity {

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;
}
