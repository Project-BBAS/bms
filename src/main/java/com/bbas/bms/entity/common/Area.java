package com.bbas.bms.entity.common;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "AREA")
@SQLDelete(sql = "UPDATE area SET delete_flag = true WHERE id = ?")
public class Area extends BaseEntity{

    @Column(name = "FIRST_ADDRESS", nullable = false)
    private Long firstAddress;

    @Column(name = "SECOND_ADDRESS", nullable = false)
    private Long secondAddress;

    @Column(name = "THIRD_ADDRESS", nullable = false)
    private Long thirdAddress;


}
