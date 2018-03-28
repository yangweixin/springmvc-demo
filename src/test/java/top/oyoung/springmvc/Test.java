package top.oyoung.springmvc;

import top.oyoung.springmvc.proxy.Book;
import top.oyoung.springmvc.proxy.CGLibProxy;

/**
 * @Method: PACKAGE_NAME
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/27 11:25
 */
public class Test{

    public static void main(String[] args) {

        Book book = CGLibProxy.getInstance().getProxy(Book.class);
        book.read();
    }
}
