import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import top.oyoung.springmvc.dao.UserDao;

import javax.annotation.Resource;

/**
 * @Method: top.oyoung.springmvc
 * @Desc:
 * @Author: Yang Weixin
 * @Date: 2018/3/26 16:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springmvc.xml"})
public class Main {

    @Resource
    private TransactionTemplate transactionTemplate;
    @Resource
    private UserDao userDao;

    @Test
    public void test(){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                userDao.insertUser("tx");
                userDao.insertUser("tx");
            }
        });
    }
}
