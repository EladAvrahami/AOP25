package com.jb.springStarter.interceptors;

import com.jb.springStarter.beans.Company;
import com.jb.springStarter.beans.Dikla;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MyInterceptor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Company && beanName.equals("company")) {
            //System.out.println(beanName);
            //(PolyMorphizem) we will use casting to get to actul bean methods.
            Company myCompany = (Company) bean;
            //check if the number is odd
            if (myCompany.getNumber()%2 != 0){
                /*
                System.out.println("Intercepted an odd number "+myCompany.getNumber());
                myCompany.setNumber(myCompany.getNumber()+1);
                System.out.println("Number was fixed, now it "+myCompany.getNumber());
                 */
                System.out.println("Found error in Zeev Mercedes s500, fixing the problem");
                return myCompany;
            } else {
                System.out.println("All is good");
            }
        }

        /*
        if (bean instanceof Dikla && beanName.equals("dikla")){
            Dikla checkValue = (Dikla) bean;
            if (checkValue.equals("Dikla")){
                checkValue.setName("We dont love dikla");
                return checkValue;
            }
        }
        */
        return bean;
    }


    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Company && beanName.equals("company")) {
            //System.out.println("We have created a new company instance :)");
            System.out.println("The car for Zeev is ready, i can call her, to pick up the car");
        }
        return bean;
    }

}
