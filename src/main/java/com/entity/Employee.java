package com.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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

	@JsonProperty("ename")
	// @NotBlank(message = "Employee Shouldn't be Null or Blank(' ') ")
	// @Pattern(regexp = "^[a-zA-Z]",message = "Employee Name Should be contains
	// only alphabets")
//	@Pattern(regexp="^[A-Z]",message="Employee Name Should be contains only alphabets")  
	private String eName;

	// uni directional mapping one to one

	// @OneToOne(cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name = "dpt_fk")
	private List<Department> department;

	@JsonProperty("salary")
	private double salary;

}
