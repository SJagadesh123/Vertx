package com.zettamine.vertex.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class MaintenanceLogItemId implements Serializable {

	private MaintenanceLogHeader maintenanceLogHeader;
	private MaintenanceTask maintenanceTask;

}
