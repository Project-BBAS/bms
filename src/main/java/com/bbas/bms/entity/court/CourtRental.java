package com.bbas.bms.entity.court;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "court_rental")
@SQLDelete(sql = "UPDATE court_rental SET delete_flag = true WHERE id = ?")
public class CourtRental extends BaseEntity {
    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "check_in", nullable = false)
    private LocalDateTime checkIn;

    @Column(name = "check_out", nullable = false)
    private LocalDateTime checkOut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "court_id")
    private Court court;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;
}