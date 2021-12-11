package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Data
public class Roni implements Teacher{
    String moto = "I am Roni, nice to meet you.";
    @Override
    public void info() {
        System.out.println("I am Roni, nice to meet you.");
    }
}
