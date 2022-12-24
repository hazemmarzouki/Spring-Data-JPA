package com.Hazem.Spring.Data.Jpa.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hazem.Spring.Data.Jpa.Entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
