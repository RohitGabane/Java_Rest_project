package com.example.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> 
{
	@Query(value="select * from student where batchid in(select b_id from batch where courseid=(select cid from course where cname=:cname));",nativeQuery = true)
	List<Student> getStudents(@Param("cname")String cname);
}
