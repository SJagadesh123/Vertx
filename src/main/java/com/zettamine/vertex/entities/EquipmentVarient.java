package com.zettamine.vertex.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
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
@Table(name = "EQPT_VAR")
public class EquipmentVarient extends BaseEntity {

    @Id
    @Column(name = "var_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "var_seq")
	@SequenceGenerator(name = "var_seq", sequenceName = "eqp_var_seq", allocationSize = 1, initialValue = 10001)
    private Integer varId;

    @ManyToOne
    @JoinColumn(name = "typ_id", nullable = false)
    private EquipmentType eqptType;

    @Column(name = "var_name", nullable = false, unique = true)
    private String varName;

    @Column(name = "notes", length = 300)
    private String notes;
    
    @OneToMany(mappedBy = "eqptVar", cascade = CascadeType.ALL)
    private List<Equipment> equipments;

  
}
