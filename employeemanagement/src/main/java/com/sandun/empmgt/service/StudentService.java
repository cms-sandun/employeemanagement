package com.sandun.empmgt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sandun.empmgt.entity.Student;
import com.sandun.empmgt.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		return (List<Student>)studentRepository.findAll();
	}
	
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).get();
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void updateStudent(Student student) {
		studentRepository.save(student);
	}
	
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

}
