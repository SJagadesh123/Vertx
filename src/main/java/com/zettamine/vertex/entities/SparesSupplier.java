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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spares_supplier")
public class SparesSupplier extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplier_id")
	private Integer supplierId;
	
	@Column(name = "supplier_name",nullable = false,unique = true)
	private String supplierName;
	
	@OneToMany(mappedBy = "sparesSupplier",cascade = CascadeType.ALL)
	private List<SparesSupplierParts> sparesSupplierParts;
	
	@OneToMany(mappedBy = "sparesSupplier",cascade = CascadeType.ALL)
	private List<SparesPurchaseHistory> sparesPurchaseHistory;

}
