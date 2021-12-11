package com.jb.springStarter.beans;

import com.jb.springStarter.AOP.SendSMS;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    //@Value("10")
    //@Value("${id}")
    private int id;

    //@Value("Natan")
    //@Value("${name}")
    private String name;

    //@Autowired
    //@Qualifier("mazal")
    //private Teacher teacher;

    private int grade;

    @SendSMS
    public void setGrade(int grade){
        this.grade=grade;
    }
}
