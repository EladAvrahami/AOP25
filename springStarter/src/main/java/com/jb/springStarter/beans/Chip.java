package com.jb.springStarter.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Data
@NoArgsConstructor
@Scope("prototype")
public class Chip {
    private String id = UUID.randomUUID().toString();
    private int catID= (int)(Math.random()*101);
}
