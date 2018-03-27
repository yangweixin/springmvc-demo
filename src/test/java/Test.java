import proxy.*;

import java.lang.reflect.Proxy;

/**
 * @Method: PACKAGE_NAME
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/27 11:25
 */
public class Test {

    public static void main(String[] args) {

        Book book = CGLibProxy.getInstance().getProxy(Book.class);
        book.read();
    }
}
