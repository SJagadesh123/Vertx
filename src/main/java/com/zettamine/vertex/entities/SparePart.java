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
@Table(name = "spare_part")
public class SparePart extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "part_id")
	private Integer partId;
	
	@Column(name = "part_name",nullable = false,unique = true)
	private String partName;
	
	@Column(name = "qoh")
	private Integer qoh;
	
	@Column(name = "uom")
	private String uom;
	
	@Column(name = "costing_method")
	private String costingMethod;
	
	@Column(name = "std_cost",nullable = true)
	private Double stdCost; 
	
	@OneToMany(mappedBy = "sparePart",cascade = CascadeType.ALL)
	private List<SparesSupplierParts> sparesSupplierParts;
	
	@OneToMany(mappedBy = "sparePart",cascade = CascadeType.ALL)
	private List<SparesPurchaseHistory> sparesPurchaseHistory;
	
}
