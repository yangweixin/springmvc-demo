package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Method: proxy
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/27 17:48
 */
public class DynamicProxy implements InvocationHandler {

    private static Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();
        Object result = method.invoke(target, args);
        after();

        return result;
    }

    private void before(){
        System.out.println("i am before");
    }

    private void after(){
        System.out.println("i am after");
    }
}
