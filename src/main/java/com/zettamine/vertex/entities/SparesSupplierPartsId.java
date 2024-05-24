package com.zettamine.vertex.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class SparesSupplierPartsId implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	private Integer sparePart;
	private Integer sparesSupplier;
}
