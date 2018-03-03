package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService {
	private static List<StudentModel> studentlist = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {	
		for (int i = 0;i < studentlist.size();i++) {
			if(studentlist.get(i).getNpm().equals(npm)) {
				return studentlist.get(i);
			}  
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudents(){
		return studentlist;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentlist.add(student);
	}

	@Override
	public StudentModel selectStudent(Optional<String> npm) {
		for (int i = 0;i < studentlist.size();i++) {
			if(studentlist.get(i).getNpm().equals(npm)) {
				return studentlist.get(i);
			}  
		}
		return null;
	}
	
	@Override
	public void deleteStudent(StudentModel student) {
		studentlist.remove(student);
	}
}
