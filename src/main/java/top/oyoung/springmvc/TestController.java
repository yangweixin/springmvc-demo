package top.oyoung.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@Controller
public class TestController {

    @RequestMapping("demo")
    @ResponseBody
    public String demo(){
        return "hello springmvc";
    }
}