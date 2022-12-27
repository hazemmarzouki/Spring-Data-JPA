package com.Hazem.Spring.Data.Jpa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Hazem.Spring.Data.Jpa.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	 public List<Student> findByFirstName(String firstName);
	 public List<Student> findByFirstNameContaining(String name);
	 public List<Student> findByGuardianName(String guardianName);
	
	 //Jpql Query
	 @Query("select s from Student s where s.email = ?1 ")
	 Student getStudentByEmailAddress(String email);
	 
	 //Jpql Query
	 @Query("select s.firstName from Student s where s.email = ?1 ")
	 String getStudentNameByEmailAddress(String email);
	 
}
