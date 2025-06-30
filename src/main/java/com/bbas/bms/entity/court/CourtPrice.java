package com.bbas.bms.entity.court;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "court_price")
@SQLDelete(sql = "UPDATE court_price SET delete_flag = true WHERE id = ?")
public class CourtPrice extends BaseEntity {

    @Column(name = "is_weekend", nullable = false)
    private Boolean isWeekend;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "price", nullable = false)
    private Long price;

}
