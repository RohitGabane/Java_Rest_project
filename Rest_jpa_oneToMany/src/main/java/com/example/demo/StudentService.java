package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService 
{
	void save(Student ref);
	List<Student> getAll();
	Student getStudent(String phonenumber);
}
