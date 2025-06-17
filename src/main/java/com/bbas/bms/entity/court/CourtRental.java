package com.bbas.bms.entity.court;

import com.bbas.bms.entity.common.BaseEntity;
import com.bbas.bms.entity.user.Users;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Table(name = "COURT_RENTAL")
@SQLDelete(sql = "UPDATE court_rental SET delete_flag = true WHERE id = ?")
public class CourtRental extends BaseEntity {
    @Column(name = "PRICE", nullable = false)
    private Long price;

    @Column(name = "CHECK_IN", nullable = false)
    private LocalDateTime checkIn;

    @Column(name = "CHECK_OUT", nullable = false)
    private LocalDateTime checkOut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURT_ID")
    private Court court;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_ID")
    private Users users;
}
