package top.oyoung.springmvc.aop;

import top.oyoung.springmvc.dao.UserDao;

import javax.annotation.Resource;

public class OperateServiceImpl implements OperateService{

    @Resource
    private UserDao userDao;

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void query() {

    }
}
