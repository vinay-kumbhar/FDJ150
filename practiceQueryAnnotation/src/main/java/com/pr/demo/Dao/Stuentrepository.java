package com.pr.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pr.demo.model.Student;


@Repository
public interface Stuentrepository extends JpaRepository<Student,Integer>{
		//sql or native query
	//@Query(value = "select s.slname from Student s where s.sid=:id",nativeQuery = true)
	//hql query or jpa query
	@Query("select s.slname from Student s where s.sid=:id")
	String findBySidOwn(@Param("id")int s);
//	@Query("FROM Student sname=:sname")
//	List<Student> getallstudentdata(@Param("sname")String sname);
	
	
	
	@Query("from Student")
	List<Student> getAllData();
	
	@Query(value="select s.slname from Student s where s.sid =:id",nativeQuery = true)
	String getstudentnameandlastname(@Param("id") int s3);
	@Query(value="select * from Student s where s.sid=:id",nativeQuery = true)
	List<Student> databyid(@Param ("id") int s4);
	@Query(value="select * from Student s where s.sname=:sn",nativeQuery = true)
	List<Student> databyname(@Param ("sn") String sname);

//	@Query("select b from Book b where b.title = ?1")
//	List<Book> findBookByTitleAndSort(String title, Sort sort);

}
