package com.pr.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pr.demo.model.Student;
import com.pr.demo.serviceImpl.StudentServiceI;

@RestController
public class Homecontroller {
	@Autowired
	StudentServiceI ss;
	@PostMapping("/one")
	public String m1(@RequestBody Student s) 
	{
		ss.save(s);
		return "ok";
		
	}
	@GetMapping("/getdata/{sid}")
public String m2(@PathVariable("sid") int s) {
		
		return  ss.getdata(s);
	
	
}
	@DeleteMapping("/del/{sid}")
	public Student m3(@PathVariable ("sid") int s) {
		
		ss.deletedata(s);
		return null;
		
	}
	@GetMapping("/getall")
	public List<Student> m4(@RequestBody Student s) {
		return ss.getallstudentdata();
		
		
	}
	@GetMapping("/get1/{sid}")
	public String m5(@PathVariable ("sid") int s3){
		return ss.getalldatafromstudent(s3);
		 
		
	}
	@GetMapping("/get2/{sid}")
	public List<Student> m6(@PathVariable ("sid") int s4)
	{
		return ss.getdataid(s4);
		
	}
	@GetMapping("get3/{sname}")
	public List<Student> m7(@PathVariable ("sname") String sname){
		return ss.getdatabyname(sname);
		
	}
}
