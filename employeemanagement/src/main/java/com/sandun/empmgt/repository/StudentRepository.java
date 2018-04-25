package com.sandun.empmgt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandun.empmgt.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{
	
}
