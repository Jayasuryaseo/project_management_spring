package com.Project.SpringApp.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Project.SpringApp.Entities.StudentEntity;

@Repository
public interface StudentDetailsRepository extends CrudRepository<StudentEntity, Integer>{

}
