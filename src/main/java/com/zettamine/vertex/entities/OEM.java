package com.zettamine.vertex.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "OEM_MD")
public class OEM extends BaseEntity {

	@Id
	@Column(name = "oem_id")
	private String oemId;

	@Column(name = "oem_name", nullable = false, unique = true)
	private String oemName;
	
	@OneToMany(mappedBy = "oem", cascade = CascadeType.ALL)
    private List<Equipment> equipments;

}
