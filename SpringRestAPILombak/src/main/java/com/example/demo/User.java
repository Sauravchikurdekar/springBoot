package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="Seeduser")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int uId;
	
	@Column
	private String uName;
	
	@Column
	private String department;
	
	@Column
	private double salary;

	
		
	}
	

