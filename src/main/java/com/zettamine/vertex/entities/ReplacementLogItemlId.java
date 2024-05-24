package com.zettamine.vertex.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
public class ReplacementLogItemlId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReplacementLogHeader replLogHeader;
    private SparePart sparePart;
    

}
