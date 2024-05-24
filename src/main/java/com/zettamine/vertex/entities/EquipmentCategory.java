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
@Table(name = "EQPT_CATG")
public class EquipmentCategory extends BaseEntity {

	@Id
	@Column(name = "catg_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer catgId;

	@Column(name = "catg_name", nullable = false, unique = true)
	private String catgName;

	@Column(name = "notes", length = 150)
	private String notes;
	
    @OneToMany(mappedBy = "eqptCatg", cascade = CascadeType.ALL)
	private List<EquipmentType> eqptTyps; 

	
}
