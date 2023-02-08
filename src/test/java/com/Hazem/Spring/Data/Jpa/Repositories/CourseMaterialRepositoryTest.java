package com.Hazem.Spring.Data.Jpa.Repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Hazem.Spring.Data.Jpa.Entities.Course;
import com.Hazem.Spring.Data.Jpa.Entities.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {

	@Autowired
	private CourseMaterialRepository repository ; 
	
	@Test
	public void SaveCourseMaterial() {
		Course course = 
				Course.builder()
				.title("Spring Data Jpa")
				.credit(20)
				.build();
		
		CourseMaterial courseMaterial = 
			CourseMaterial.builder()
			.url("www.SpringDataJpaCourse.tn")
			.course(course)
			.build();
		
		repository.save(courseMaterial);
	}
	
	@Test
	public void printAllCourseMaterials() {
		List<CourseMaterial> courseMaterials = 
				repository.findAll();
		
		System.out.println("courseMaterials = " + courseMaterials);
	}
	

}
