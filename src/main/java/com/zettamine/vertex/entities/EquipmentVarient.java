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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer varId;

    @ManyToOne
    @JoinColumn(name = "eqpt_typ_id", nullable = false)
    private EquipmentType eqptType;

    @Column(name = "var_name", nullable = false, unique = true)
    private String varName;

    @Column(name = "notes", length = 300)
    private String notes;
    
    @OneToMany(mappedBy = "equipmentVarient", cascade = CascadeType.ALL)
    private List<Equipment> equipments;

  
}
