package top.oyoung.springmvc.tx;

import org.junit.Test;
import top.oyoung.springmvc.BaseTest;
import top.oyoung.springmvc.dao.UserDao;
import top.oyoung.springmvc.service.TxService;

import javax.annotation.Resource;

/**
 * @Method: tx
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/28 9:01
 */
public class TxTest extends BaseTest {

    @Resource
    private TxService txService;

    @Test
    public void txTest(){
        txService.updateUser();
    }
}
