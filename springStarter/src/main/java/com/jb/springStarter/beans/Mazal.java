package com.jb.springStarter.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Mazal implements Teacher{
    String moto = "jfskfj ksdfkjs dfkjs fksdh fkjsdf kj";
    @Override
    public void info() {

    }
}
