package top.oyoung.springmvc.aop;

import java.util.Date;

public class TimeLogger {

    public void markTime(){
        System.out.println(new Date());
    }
}
