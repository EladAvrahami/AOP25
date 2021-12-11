package com.jb.springStarter.Service;

import com.jb.springStarter.AOP.SMSAble;
import com.jb.springStarter.utils.Art;
import org.springframework.stereotype.Service;

@Service
public class IvgentService implements SMSAble {
    public void sendIvgeny(){
        System.out.println(Art.IVGENY);
        System.out.println("SPAM SPAM SPAM : Ivgeny and Dikla, sitting on a tree.....");
    }

    @Override
    public void sendSMS(String msg) {
        System.out.println(Art.IVGENY);
        System.out.println("SPAM SPAM SPAM : Ivgeny and Dikla, sitting on a tree.....");
    }
}
