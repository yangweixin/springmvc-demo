package top.oyoung.springmvc.service;

import com.sun.javaws.security.AppPolicy;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.oyoung.springmvc.dao.UserDao;

import javax.annotation.Resource;
import java.applet.AppletContext;

/**
 * @Method: top.oyoung.springmvc.service
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/28 9:28
 */
@Service
public class TxService {

    @Resource
    private UserDao userDao;

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.SUPPORTS)
    public void updateUser(){
        System.out.println("outter tx start");

        System.out.println(userDao.getUser(2, System.currentTimeMillis()));
        System.out.println(userDao.getUser(2, System.currentTimeMillis()));
        System.out.println(userDao.getUser(2, System.currentTimeMillis()));

//        ((TxService)AopContext.currentProxy()).insertUser();
        userDao.insert();
        System.out.println("outter tx end");


    }

    @Transactional(propagation = Propagation.NEVER)
    public void insertUser(){
        System.out.println("inner tx start");

        System.out.println(userDao.getUser(2, System.currentTimeMillis()));
        System.out.println(userDao.getUser(2, System.currentTimeMillis()));
        System.out.println(userDao.getUser(2, System.currentTimeMillis()));
        userDao.update("赵书记");
//        throw new RuntimeException();
        System.out.println("inner tx end");
    }

}
