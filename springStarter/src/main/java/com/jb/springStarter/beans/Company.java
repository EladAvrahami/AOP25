package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Data
public class Company {
    private int number = (int)(Math.random()*101);
}
