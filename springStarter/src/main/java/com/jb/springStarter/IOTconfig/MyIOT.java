package com.jb.springStarter.IOTconfig;

import com.jb.springStarter.beans.Manager;
import com.jb.springStarter.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component // designed for classes
@Configuration //for handling beans
public class MyIOT {
    @Bean //instance
    @Scope("prototype")
    public Manager proto(){  //DI - Dependency Injection
        Manager myManager = new Manager();
        myManager.setName("zeevik");
        myManager.setSalary(55_000);
        myManager.setCellPhone("052-404-3142");
        return myManager;
    }

    @Bean //instance
    @Scope("prototype")
    public Manager proto2(){  //DI - Dependency Injection
        Manager myManager = new Manager();
        myManager.setName("Natan");
        myManager.setSalary(5_000); //per year
        myManager.setCellPhone("052-123-4562");
        return myManager;
    }

    @Bean
    public Student dekel (){
        Student returnValue = new Student();
        returnValue.setGrade(90);
        returnValue.setName("Dikla");
        returnValue.setId(5);

        return returnValue;
    }
}
