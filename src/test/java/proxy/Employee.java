package proxy;

/**
 * @Method: proxy
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/27 17:47
 */
public class Employee implements Person {

    @Override
    public void say(String sth) {
        System.out.println(sth);
    }
}
