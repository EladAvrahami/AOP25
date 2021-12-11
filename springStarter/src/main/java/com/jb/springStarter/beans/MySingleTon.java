package com.jb.springStarter.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
/*
██╗      ██████╗ ███╗   ███╗██████╗  ██████╗ ██╗  ██╗
██║     ██╔═══██╗████╗ ████║██╔══██╗██╔═══██╗██║ ██╔╝
██║     ██║   ██║██╔████╔██║██████╔╝██║   ██║█████╔╝
██║     ██║   ██║██║╚██╔╝██║██╔══██╗██║   ██║██╔═██╗
███████╗╚██████╔╝██║ ╚═╝ ██║██████╔╝╚██████╔╝██║  ██╗
╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝
 */
@Data //getters setter hashcode equal toString
@NoArgsConstructor // default ctor

public class MySingleTon {
    private int x = (int)(Math.random()*101);
}
