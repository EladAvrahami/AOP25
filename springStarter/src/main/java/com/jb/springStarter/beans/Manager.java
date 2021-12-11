package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

//singleTon
@Component
@Data
public class Manager {
    private String name;
    private int Salary;
    private String cellPhone;
    private List<String> employee;
}
