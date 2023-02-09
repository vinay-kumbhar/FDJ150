package com.pr.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.pr.demo.Dao.Stuentrepository;
import com.pr.demo.model.Student;

@Service
public class StudentService implements StudentServiceI{

	@Autowired
	Stuentrepository sr;
	@Override
	public void save(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		
	}
	public String getdata(int s) {
		
		
		return sr.findBySidOwn(s);
		
	}
	@Override
	public void deletedata(int s) {
		//sr.findBySid(s);
		sr.deleteById(s);
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Student> getallstudentdata() {
		return sr.getAllData();
	}
	
	@Override
	public String getalldatafromstudent(int s3) {
		// TODO Auto-generated method stub
		return sr.getstudentnameandlastname(s3);
	}
	@Override
	public List<Student> getdataid(int s4) {
		return sr.databyid(s4);
	}
	@Override
	public List<Student> getdatabyname(String sname) {
		// TODO Auto-generated method stub
		return sr.databyname(sname);
	}

}
