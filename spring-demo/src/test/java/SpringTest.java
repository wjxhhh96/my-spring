import bean.UserService;
import com.wjx.springframework.BeanDefinition;
import com.wjx.springframework.BeanFactory;
import org.junit.Test;

/**
 * <p>
 * <b>SpringTest</b>
 * </p>
 *
 * @author Wjx
 * @Description: TODO
 * @since 2021/11/23
 */
public class SpringTest {

    @Test
    public void test_BeanFactory(){
        //1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注入bean
        BeanDefinition definition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",definition);

        //3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
