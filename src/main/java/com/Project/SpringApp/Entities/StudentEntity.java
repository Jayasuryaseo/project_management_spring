package com.Project.SpringApp.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.Project.SpringApp.Domain.StudentDomain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "student_marks")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString
public class StudentEntity extends BaseEntity {
	
    @Column(name = "name")
    private String name;
    
    @Column(name = "mark_one")
    private int markOne; 
    
    @Column(name = "mark_two")
    private int markTwo;

    @Column(name = "mark_three")
    private int markThree;
    
    @Column(name = "mark_four")
    private int markFour;
    
    @Column(name = "mark_five")
    private int markFive;
    
    
    public StudentEntity(StudentDomain studentDomain) {

    	if (studentDomain.getId() > 0) {
    	    this.setId(studentDomain.getId());
    	}
//    	this.setActive(studentDomain.getActive());
        this.setName(studentDomain.getName());
        this.setMarkOne(studentDomain.getMarkOne());
        this.setMarkTwo(studentDomain.getMarkTwo());
        this.setMarkThree(studentDomain.getMarkThree());
        this.setMarkFour(studentDomain.getMarkFour());
        this.setMarkFive(studentDomain.getMarkFive());
    	
        }
    
    public StudentDomain getDomain() {

    	StudentDomain domain = new StudentDomain();

    	domain.setId(this.getId());
//    	domain.setActive(this.getActive());
    	domain.setName(this.getName());
    	domain.setMarkOne(this.getMarkOne());
    	domain.setMarkTwo(this.getMarkTwo());
    	domain.setMarkThree(this.getMarkThree());
    	domain.setMarkFour(this.getMarkFour());
    	domain.setMarkFive(this.getMarkFive());
    	

    	return domain;

        }

}
