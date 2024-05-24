package com.zettamine.vertex.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ReplacementLogDetail")
@IdClass(ReplacementLogDetailId.class)
public class ReplacementLogItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "log_id")
    private ReplacementLogHeader replacementLogHeader;

    @Id
    @ManyToOne
    @JoinColumn(name = "part_id")
    private SparePart sparePart;

    @Column(name = "repl_dt")
    private LocalDate replacementDate;

    @Column(name = "qty")
    private int quantity;

    @Column(name = "unit_cost")
    private BigDecimal unitCost;

    @Column(name = "repl_notes")
    private String replacementNotes;

    @Column(name = "tech_id")
    private int technicianId;
}