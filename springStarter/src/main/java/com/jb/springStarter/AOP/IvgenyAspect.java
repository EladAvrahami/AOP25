package com.jb.springStarter.AOP;

import com.jb.springStarter.Service.IvgentService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*aspect help connect between sendIvgeny homede annot to ivgentService*/
@Component
@Aspect
public class IvgenyAspect {
    @Autowired
    private IvgentService ivgenyService;

    @After("@annotation(SendIvgeny)")/*להתבייט על האנוטציה */
    private void ivgeny(){
        ivgenyService.sendIvgeny();
    }
}
