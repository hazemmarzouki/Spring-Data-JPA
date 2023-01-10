package com.Hazem.Spring.Data.Jpa.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	 
	 //Native sql Query 
	 @Query(value = "SELECT * FROM tbl_student s WHERE s.email_address = ?1 " ,
			nativeQuery = true)
	 Student getStudentByEmailAddressNative(String email);
	 
	 @Modifying
	 @Transactional
	 @Query(value = "UPDATE tbl_student set first_name = ?1 WHERE email_address=?2  " , 
			 nativeQuery = true )
	 int updateStudentNameByEmailId(String firstName , String email);
	 

	 
	 
	 
}
