package com.Project.SpringApp.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.SpringApp.Domain.StudentDomain;
import com.Project.SpringApp.Entities.StudentEntity;

@Service
public class StudentDetailsService {

    @Autowired
    StudentDetailsRepository StudentDetailsRepository;

    public StudentDomain create(StudentDomain studentDomainIn) {

	StudentEntity studentEntyIn = new StudentEntity(studentDomainIn);
	StudentEntity studentEntyOut = StudentDetailsRepository.save(studentEntyIn);
	StudentDomain studentDomainOut = studentEntyOut.getDomain();
	return studentDomainOut;

    }

    public List<StudentDomain> getAll(String prodTypeFilter) {
	List<StudentEntity> prodTypeEntyList = null;
	List<StudentDomain> prodTypeDomainList = new ArrayList<StudentDomain>();
//	JSONObject jsonObject = null;
//	if (prodTypeFilter != null) {
//	    jsonObject = new JSONObject(prodTypeFilter.trim());
//	    CustomSpecification<StudentEntity> customSpecification = new CustomSpecification<StudentEntity>(
//		    jsonObject);
//	    prodTypeEntyList = StudentDetailsRepository.findAll(customSpecification);
//	} else {
	prodTypeEntyList = (List<StudentEntity>) StudentDetailsRepository.findAll();
//	}
	for (StudentEntity prodTypeEnty : prodTypeEntyList) {
	    prodTypeDomainList.add(prodTypeEnty.getDomain());
	}
	return prodTypeDomainList;
    }

}
