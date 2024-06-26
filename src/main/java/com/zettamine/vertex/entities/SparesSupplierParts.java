package com.zettamine.vertex.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spare_supplier_part")
@IdClass(SparesSupplierPartsId.class)
public class SparesSupplierParts {
	
	
	@Id
	@ManyToOne
	@JoinColumn(name = "part_id", nullable = false)
	private SparePart sparePart;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "supplier_id", nullable = false)
	private SparesSupplier sparesSupplier;
	
	@Column(name = "lead_time")
	private Integer leadTime;
	
}
