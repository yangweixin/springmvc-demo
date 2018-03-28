package top.oyoung.springmvc;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @Method: PACKAGE_NAME
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/28 8:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resources")
@ContextConfiguration("classpath:springmvc.xml")
public class BaseTest {
}
