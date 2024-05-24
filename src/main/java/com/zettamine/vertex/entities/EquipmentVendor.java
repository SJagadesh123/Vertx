package com.zettamine.vertex.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "EQPT_VEND")
public class EquipmentVendor extends BaseEntity {

	@Id
	@Column(name = "vend_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vendId;

	@Column(name = "vend_reg_name", nullable = false, unique = true)
	private String vendRegName;

	@OneToMany(mappedBy = "eqptVend", cascade = CascadeType.ALL)
    private List<Equipment> equipments;

	
}
