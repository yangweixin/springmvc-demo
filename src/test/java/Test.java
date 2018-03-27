import proxy.DynamicProxy;
import proxy.Employee;
import proxy.Person;

import java.lang.reflect.Proxy;

/**
 * @Method: PACKAGE_NAME
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/27 11:25
 */
public class Test {

    public static void main(String[] args) {

        Employee employee = new Employee();
        DynamicProxy dynamicProxy = new DynamicProxy(employee);

        Person employeeProxy = dynamicProxy.getProxy();

        employeeProxy.say("young");
    }
}
