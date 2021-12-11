package com.jb.springStarter.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
@NoArgsConstructor
public class Cat {
    @Value("Mitzi")
    private String name;

    @Autowired
    private Chip chip;


}
