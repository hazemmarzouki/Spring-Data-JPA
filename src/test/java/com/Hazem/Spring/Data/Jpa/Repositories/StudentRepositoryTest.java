package com.Hazem.Spring.Data.Jpa.Repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Hazem.Spring.Data.Jpa.Entities.Guardian;
import com.Hazem.Spring.Data.Jpa.Entities.Student;

@SpringBootTest
class StudentRepositoryTest {

	@Autowired
	private StudentRepository studentRepository ; 
	
	@Test
	public void saveStudent() {
		Student student = Student.builder()
				.email("marzouki.contact@gmail.com")
				.firstName("Hazem")
				.LastName("Marzouki")
				.build() ; 	
		
		studentRepository.save(student);
	}
	
	@Test
	public void saveStudentWithGardian() {
			
		Guardian guardian = Guardian.builder()
				.email("sarra@yahoo.com")
				.name("Sarah")
				.mobile("989898989")
				.build();
		
		Student student = Student.builder()
				.email("potter@gmail.com")
				.firstName("John")
				.LastName("Doe")
				.guardian(guardian)
				.build() ; 	
	
		studentRepository.save(student);
	}
	
	@Test
	public void getAllStudents() {
		List<Student> studentsList = studentRepository.findAll();
		System.out.println("StudentList = " + studentsList);
	
	}
	
	@Test
	public void printStudentByFirstname() {
		List<Student> students = studentRepository.findByFirstName("John");
		System.out.println("StudentList = " + students);

	}
	
	@Test 
	public void printStudentByFirstnameContaining() {
		List<Student> students = studentRepository.findByFirstNameContaining("Jo");
		System.out.println("StudentList = " + students);

	}
	
	

}
