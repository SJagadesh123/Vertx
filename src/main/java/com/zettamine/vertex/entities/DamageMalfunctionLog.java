package com.zettamine.vertex.entities;

import java.time.LocalDate;

import org.apache.el.parser.AstFalse;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DMG_MF_LOG")
@Setter
@Getter
@AllArgsConstructor
public class DamageMalfunctionLog extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer logId;
	
	@ManyToOne
	@JoinColumn(name = "eqpt_id", nullable = false)
	private Equipment eqpt;
	
	@Column(name = "start_dt")
	private LocalDate startDate;
	
	@Column(name = "closure_dt")
	private LocalDate closureDate;
	
	@Column(name = "closed_by")
	private String closedBy;
	
	@Column(name = "dmg_mf_notes")
	private String damNotes;
	
	@Column(name="repl_notes")
	private String replNotes;
	
	@Column(name = "handling_method")
	private String handlingMethod;
	
	@Column(name = "inv_doc")
	private String invoiceDoc;
	
	@OneToOne
	@JoinColumn(name = "repl_log_id")
	private ReplacementLogHeader replacement;
	
	@Column(name = "status")
	private String status;
}
