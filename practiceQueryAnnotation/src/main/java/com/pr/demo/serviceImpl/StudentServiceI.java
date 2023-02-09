package com.pr.demo.serviceImpl;

import java.util.List;

import com.pr.demo.model.Student;

public interface StudentServiceI {

	void save(Student s);

	String getdata(int s);

	void deletedata(int s);

	List<Student> getallstudentdata();

	String getalldatafromstudent(int s3);

	List<Student> getdataid(int s4);

	List<Student> getdatabyname(String sname);

}
