package com.jb.springStarter.AOP;

import com.jb.springStarter.Service.SMSService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*aspect will let me the connection between my new home-made annotation to what it does */
@Aspect
@Component
public class SMSAspect {
    @Autowired
    private SMSService smsService;
    /*הפעלה אחרי שגילינו את האנוטציה*/ /*על מה נתבייט*/     /*שם האנוטציה שנתבייט*/
    @After                       ("@annotation             (SendSMS)")/*manage handel to take care after sendSMS used*/
    public void sendSMSadvice() {
        smsService.sendSMS("Ivgeny is in da house !!!!");
    }
}
