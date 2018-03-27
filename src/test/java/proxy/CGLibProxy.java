package proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {
    private static CGLibProxy cgLibProxy = new CGLibProxy();

    private CGLibProxy(){

    }

    public static CGLibProxy getInstance(){
        return cgLibProxy;
    }

    public <T> T getProxy(Class<T> clazz){
        return (T)Enhancer.create(clazz,this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
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
