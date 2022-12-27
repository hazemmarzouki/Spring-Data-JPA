package com.Hazem.Spring.Data.Jpa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hazem.Spring.Data.Jpa.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	 public List<Student> findByFirstName(String firstName);
	 public List<Student> findByFirstNameContaining(String name);
	 public List<Student> findByGuardianName(String guardianName);
	 public List<Student> findByFirstNameAndLastname(String firstName , String lastName);

}
