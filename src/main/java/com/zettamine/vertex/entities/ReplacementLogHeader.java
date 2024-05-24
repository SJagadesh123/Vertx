package com.zettamine.vertex.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

<<<<<<< HEAD
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
=======
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
>>>>>>> cb2b2fd126e14bef1231e29bedf172bf336290c0
@Entity
@Table(name = "REPL_LOG_H")
public class ReplacementLogHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer logId;

    @OneToOne
    @JoinColumn(name = "eqpt_id")
    private Equipment equipment;

    @Column(name = "repl_trigger")
    private String replTrigger;

    @Column(name = "repl_log_cl_dt")
    private LocalDate replLogClosingDate;
    
    @OneToMany(mappedBy = "repLogH", cascade = CascadeType.ALL)
    private List<ReplacementLogItem> replLogItem;
}

