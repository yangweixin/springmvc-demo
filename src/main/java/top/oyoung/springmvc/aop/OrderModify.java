package top.oyoung.springmvc.aop;

public class OrderModify implements Modify{

    @Override
    public void update() {
        System.out.println("order update");
    }

    @Override
    public void select() {
        System.out.println("order select");
    }
}
