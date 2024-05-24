package com.zettamine.vertex.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MaintenanceLogHeader extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "log_id")
	private Integer logId;
    
    @ManyToOne
    @JoinColumn(name = "eqpt_id", nullable = false)
    private Equipment equipment;
    
    @Column(name = "start_dt")
    private LocalDate startDt;
    
    @Column(name = "closure_dt")
    private LocalDate closureDt;
    
    @Column(name = "closed_by")
    private String closedBy;
    
    @Column(name = "next_due_dt")
    private LocalDate nextDueDt;
    
    @Column(name = "log_notes")
    private String logNotes;
    
    @Column(name = "mntc_metho")
    private String mntcMethod;
    
    @Column(name = "mntc_inv_doc")
    private String mntcInvDoc;
    
    @Column(name = "repl_log_id")
    private             replacementLogId;
    
    @Column(name = "status",nullable =false)
    private String status;
}
