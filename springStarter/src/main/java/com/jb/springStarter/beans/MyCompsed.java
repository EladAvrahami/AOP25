package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Data
@Scope("prototype")
public class MyCompsed {
    @Autowired
    private Cat cat;

    @Autowired
    private Dikla dikla;


    @Autowired
    private Company company;

    //odds numbers are not allowed
    //DNTC !!!!!! Do Not Touch The Code
}
