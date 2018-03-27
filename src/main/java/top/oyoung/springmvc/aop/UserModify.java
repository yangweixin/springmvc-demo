package top.oyoung.springmvc.aop;

public class UserModify implements Modify {

    @Override
    public void update() {
        System.out.println("user update");
    }

    @Override
    public void select() {
        System.out.println("user select");
    }
}
