package top.oyoung.springmvc.aop;

public class Logger {

    public void logBefore(){
        System.out.println("log before");
    }

    public void logAfter(){
        System.out.println("log after");
    }
}
