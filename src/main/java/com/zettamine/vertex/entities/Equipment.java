package com.zettamine.vertex.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EQPT")
public class Equipment extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eqptId;

	@Column(name = "eqpt_name", nullable = false, unique = true)
	private String eqptName;

	@ManyToOne
	@JoinColumn(name = "eqpt_typ_id", nullable = false)
	private EquipmentType eqptType;

	@ManyToOne
	@JoinColumn(name = "eqpt_var_id")
	private EquipmentVarient eqptVar;

	@ManyToOne
	@JoinColumn(name = "oem_id")
	private OEM oem;

	@ManyToOne
	@JoinColumn(name = "eqpt_vend_id", nullable = false)
	private EquipmentVendor eqptVend;

	@Column(name = "mfr_model", nullable = false)
	private String mfrModel;

	@Column(name = "load_cpcty")
	private Integer loadCpcty;

	@Column(name = "load_cpcty_uom", length = 5)
	private String loadCpctyUom;

	@Column(name = "mfg_dt")
	private LocalDate mfgDt;

	@Column(name = "pur_dt")
	private LocalDate purDt;

	@Column(name = "wrty_exp_dt")
	private LocalDate wrtyExpDt;

	@Column(name = "wrty_doc_link", length = 255)
	private String wrtyDocLink;

	@Column(name = "status", length = 50)
	private String status;

	@Column(name = "eqpt_notes", length = 500)
	private String eqptNotes;

	@Column(name = "loc_id", length = 20)
	private String locId;

}
