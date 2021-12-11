package com.jb.springStarter.beans;

import com.jb.springStarter.AOP.SendIvgeny;
import com.jb.springStarter.AOP.SendSMS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor //ctor with all fields.
@Scope("prototype")
@Builder
public class Dikla {
    @Value("5")
    private int id;

    @Value("Dikla")
    private String name;

    @Value("100")
    private int grade;

    @SendSMS
    public void setGrade(int grade){
        this.grade=grade;
    }

    @SendIvgeny/*בכל פעם שנעשה setName לאובייקט מסוג דיקלה ידפיס לאחר ההגדרה של השם החדש יבגני בגדול*/
    public void setName(String name){
        this.name=name;
    }
}
