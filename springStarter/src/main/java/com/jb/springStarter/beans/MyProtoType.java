package com.jb.springStarter.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Scope("prototype") //do not make this class singleton !!!!
//prototype is Lazy method
public class MyProtoType {
    private int x = (int)(Math.random()*101);
}
