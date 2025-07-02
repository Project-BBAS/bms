package com.bbas.bms.entity.rent;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "rent")
@SQLDelete(sql = "UPDATE rent SET delete_flag = true WHERE id = ?")
public class Rent extends BaseEntity {

    @Column(name = "start_date", nullable = false)
    private LocalDateTime start_date;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime end_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id", nullable = false)
    private Users users;
}
