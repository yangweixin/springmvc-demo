package top.oyoung.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.oyoung.springmvc.dao.UserDao;

import javax.annotation.Resource;

@RequestMapping("/")
@Controller
public class TestController {

    @Resource
    private UserDao userDao;

    @RequestMapping("demo")
    @ResponseBody
    public String demo(){
        System.out.println("xml: "+ userDao.getUser());
        System.out.println("annotation: "+ userDao.getUserById(2));
        return "hello springmvc";
    }
}
