package com.jb.springStarter.Service;

import com.jb.springStarter.AOP.SMSAble;
import com.jb.springStarter.utils.Art;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import static com.jb.springStarter.utils.Art.vip;

/*מחלקה זו תגיד לי מה לעשות כאשר האנוטציה שיצרתי בשם sendSMS תפעל */


/*
סדר הכתיבה של אנוטציה ומימושה
שלב1 - יצירת אנוטציה מותאמת אישית
שלב 2 -יצירת הסרביס שיאמר מה האנוטציה עושה ובתוכה נכניס את המתודה שאני רוצה להפעיל כאשר אני נתקל באותה אנוטציה
כאן למשל מדובר בsendSMS
שלב 3 -יצירת ASPECT שמחבר לי בין שלב 1 ו 2 באמצעות אנוטציית @After
 */
/*סדר פעולות אנוטציה
* 1 -sendSMS homade interface
* 2- put the new annotaion on dikla class @SendSMS
* 3-כאשר הספרינג לא יזהה את האנוטציה שיצרנו הוא יחפש אותה בSMSAspect שבה יש הפניה לפעולה שיצרנו בSERVICE
* 4- serviceSMS will impliment the method that was sent from SMSaspect call method
* */


@Service
public class SMSService implements SMSAble {
    public void sendSMS(String message){
        System.out.println(vip);
        System.out.println("SPAM SPAM SPAM : "+message);
    }
}
