package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MathsTeacher {

	public MathsTeacher() {
		System.out.println("this is mathstecher constructor");
	}

	public void teachermethod() {
		System.out.println("this is mathsTeacher method");
	}
}

@Component
public class collage {
	@Autowired

	private MathsTeacher teacher;

	public void collageMethod() {
		teacher.teachermethod();
		System.out.println("This is collage method");
	}

}
