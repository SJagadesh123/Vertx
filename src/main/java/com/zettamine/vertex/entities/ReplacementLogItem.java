package com.zettamine.vertex.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
<<<<<<< HEAD
import lombok.Setter;



=======
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> cb2b2fd126e14bef1231e29bedf172bf336290c0
@Entity
@Setter
@Getter
@Table(name = "ReplacementLogDetail")
@IdClass(ReplacementLogItemlId.class)
public class ReplacementLogItem {
    @Id
    @ManyToOne
<<<<<<< HEAD
    @JoinColumn(name = "log_id", nullable = false)
=======
    @JoinColumn(name = "log_id")
>>>>>>> cb2b2fd126e14bef1231e29bedf172bf336290c0
    private ReplacementLogHeader replLogHeader;

    @Id
    @ManyToOne
    @JoinColumn(name = "part_id")
    private SparePart sparePart;

    @Column(name = "repl_dt")
    private LocalDate replDate;

    @Column(name = "qty")
    private Integer quantity;

    @Column(name = "unit_cost")
    private Double unitCost;

    @Column(name = "repl_notes")
    private String replNotes;

    @Column(name = "tech_id")
    private Integer technicianId;
<<<<<<< HEAD
    
    
=======
>>>>>>> cb2b2fd126e14bef1231e29bedf172bf336290c0
}
