package com.bbas.bms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;

import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SoftDelete;

@Entity
@Table(name = "team")
@SoftDelete
@NoArgsConstructor
public class Team extends BaseEntity{


}
