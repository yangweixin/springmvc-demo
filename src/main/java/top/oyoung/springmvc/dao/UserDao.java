package top.oyoung.springmvc.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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
    public User getUser();

    @Select("select * from user where id=#{id}")
    public User getUserById(int id);

    @Insert({"insert user (account,name,address) value(#{name}, #{name}, #{name})}"})
    public int insertUser(String name);

    @Insert("insert into user (account,name,address) value('sun','孙秘书','西安')")
    public void insert();

    @Update("update user set account='zhen' where id=2")
    public void update();

    @Delete("delete from user where id=1")
    public void delete();

    @Select("select * from user")
    public List<Map<String, Object>> query();
}
