package com.zettamine.vertex.entities;

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

@Entity
@Table(name = "EQPT_TYP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentType extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer typeId;

	@Column(name = "typ_name", nullable = false, unique = true)
	private String typeName;

	@Column(name = "mntc_freq")
	private Integer mntcFreq;

	@Column(name = "var_exist")
	private Boolean varExist;

	@Column(name = "notes", length = 200)
	private String notes;

	@ManyToOne
	@JoinColumn(name = "eqpt_catg_id", nullable = false)
	private EquipmentCategory eqptCatg;

	
}
