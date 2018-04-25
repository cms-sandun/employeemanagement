package com.sandun.empmgt.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sandun.empmgt.entity.Student;
import com.sandun.empmgt.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value="/students", method=RequestMethod.GET)
	public Student getStudentById(Integer id) {
		return studentService.getStudentById(id);
	}

        @RequestMapping(value="/students", method=RequestMethod.POST)
	public void addStudent(Student student) {
		studentService.addStudent(student);
	}

	@RequestMapping(value="/students", method=RequestMethod.PUT)
	public void updateStudent(Student student) {
		studentService.updateStudent(student);
	}
	
	@RequestMapping(value="/students", method=RequestMethod.DELETE)
	public void deleteStudent(Student student) {
		studentService.deleteStudent(student);
	}

}
