package top.oyoung.springmvc.dao;

import org.apache.ibatis.annotations.Select;
import top.oyoung.springmvc.entity.User;

/**
 * @Method: top.oyoung.springmvc.dao
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/26 10:21
 */
public interface UserDao {
    public User getUser();

    @Select("select * from user where id=#{id}")
    public User getUserById(int id);
}
