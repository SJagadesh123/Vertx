package com.zettamine.vertex.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MNTC_TASK")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class MaintenanceTask extends BaseEntity {

	@Id
	@Column(name = "task_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mntc_task_seq")
	@SequenceGenerator(name = "mntc_task_seq", sequenceName = "mntc_task_sequence",initialValue = 1001,allocationSize = 1)
	private Integer taskId;
	
	@Column(name = "task_name")
	private String taskName;
	
	@ManyToOne
	@JoinColumn(name = "eqp_typ_id", nullable = false)
	private EquipmentType eqptType;
	
	@ManyToOne
	@JoinColumn(name = "eqp_var_id", nullable = true)
	private EquipmentVarient eqptVarient;	
	
	@Column(name = "task_desc")
	private String taskDesc;
}
