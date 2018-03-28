package top.oyoung.springmvc.dao;

import org.apache.ibatis.annotations.*;
import top.oyoung.springmvc.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @Method: top.oyoung.springmvc.dao
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/26 10:21
 */
public interface UserDao {
    public User getUser(@Param("id")int id,@Param("time")long time);

    @Select("select * from user where id=#{id}")
    public User getUserById(int id);

    @Select("select * from user")
    public List<User> getAllUser();

    @Insert({"insert user (account,name,address) value(#{name}, #{name}, #{name})}"})
    public int insertUser(String name);

    @Insert("insert into user (account,name,address) value('sun','孙秘书','西安')")
    public void insert();

    @Update("update info set name=#{name} where id=2")
    public void update(String name);

    @Delete("delete from user where id=1")
    public void delete();

    @Select("select * from user")
    public List<Map<String, Object>> query();
}
