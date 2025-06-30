package com.bbas.bms.entity.court;

import com.bbas.bms.entity.common.BaseEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;

@Entity
@NoArgsConstructor
@Table(name = "court")
@SQLDelete(sql = "UPDATE court SET delete_flag = true WHERE id = ?")
public class Court extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "addres", nullable = false, unique = true)
    private String address;

    @Column(name = "url", unique = true)
    private String url;

    @Column(name = "phone_num", unique = true)
    private String phone_num;

    @Column(name = "is_indoor", nullable = false)
    private String is_indoor;

    @Column(name = "open_time", nullable = false)
    private String open_time;

    @Column(name = "close_time", nullable = false)
    private String close_time;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "court_price_id")
    private CourtPrice courtPrice;

}
