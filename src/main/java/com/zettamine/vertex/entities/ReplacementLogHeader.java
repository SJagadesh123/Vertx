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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    private String replacementTrigger;

    @Column(name = "repl_log_cl_dt")
    private LocalDate replacementLogClosingDate;
    
    @OneToMany(mappedBy = "repLogH", cascade = CascadeType.ALL)
    private List<ReplacementLogItem> replacementLogItem;
}

