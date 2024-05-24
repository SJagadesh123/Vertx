package com.zettamine.vertex.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Setter
@Getter
@Table(name = "ReplacementLogDetail")
@IdClass(ReplacementLogItemlId.class)
public class ReplacementLogItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "log_id", nullable = false)
    private ReplacementLogHeader replLogHeader;

    @Id
    @ManyToOne
    @JoinColumn(name = "part_id")
    private SparePart sparePart;

    @Column(name = "repl_dt")
    private LocalDate replacementDate;

    @Column(name = "qty")
    private Integer quantity;

    @Column(name = "unit_cost")
    private Double unitCost;

    @Column(name = "repl_notes")
    private String replacementNotes;

    @Column(name = "tech_id")
    private Integer technicianId;
    
    
}
