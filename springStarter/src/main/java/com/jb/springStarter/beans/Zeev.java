package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Zeev implements Teacher{
    String moto = "Hello my brother from another mother";
    @Override
    public void info() {
        System.out.println("My name is zeevik, nice to have you on board");
    }
}
