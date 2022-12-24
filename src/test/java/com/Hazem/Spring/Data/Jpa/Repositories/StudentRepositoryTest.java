package com.Hazem.Spring.Data.Jpa.Repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
				.guardianName("John")
				.guardianEmail("JohnDoe123@contact.com")
				.guardianMobile("99999999")
				.build() ; 	
		
		studentRepository.save(student);
	}
	
	@Test
	public void getAllStudents() {
		List<Student> studentsList = studentRepository.findAll();
		System.out.println("StudentList = " + studentsList);
	
	}

}
