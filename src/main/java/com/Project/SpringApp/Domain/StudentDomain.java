package com.Project.SpringApp.Domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
@NoArgsConstructor
public class StudentDomain extends BaseDomain{
	
    private String name;
    
    private int markOne; 
    
    private int markTwo;

    private int markThree;
    
    private int markFour;
    
    private int markFive;
	
}
