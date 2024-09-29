package com.Project.SpringApp.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Project.SpringApp.Domain.StudentDomain;

@RestController
@RequestMapping(value = "/student/marks")
public class StudentDetailsController {

    @Autowired
    StudentDetailsService studentDetailsService;

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentDetailsController.class);

    @PostMapping("/create")
    @ResponseStatus(value = HttpStatus.CREATED)
    public StudentDomain create(@RequestBody StudentDomain studentDomainIn) throws Exception {
	StudentDomain studentDomainOut = studentDetailsService.create(studentDomainIn);
	if (studentDomainOut == null) {
	    LOGGER.debug("creation failed" + studentDomainIn.getName());
	    throw new Exception("417");
	}
	return studentDomainOut;
    }

}
