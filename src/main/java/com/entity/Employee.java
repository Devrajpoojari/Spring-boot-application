package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int eId;
	
	@NotBlank(message = "Employee Shouldn't be Null or Blank(' ') ")
	//@Pattern(regexp = "^[a-zA-Z]",message = "Employee Name Should be contains only alphabets")
	private String eName;
	
	private double salary;

}
