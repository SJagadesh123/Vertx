package com.zettamine.vertex.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class ReplacementLogItemlId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ReplacementLogHeader replLogHeader;
    private SparePart sparePart;
    

}
