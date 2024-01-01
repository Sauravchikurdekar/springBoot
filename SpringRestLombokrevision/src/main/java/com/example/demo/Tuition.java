package com.example.demo;

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
@Table(name="Tuision")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter



public class Tuition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	private int TId;
	private String TeacherName;
	private String TeacherSubject;
	private int StudentCount;
	

}
