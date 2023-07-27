package com.example.services;

import java.util.List;

import com.example.entities.Student;
import com.example.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentManagerImpl implements StudentManager 
{
	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getStudents(String cname) {
		
		return repository.getStudents(cname);
	}

}
