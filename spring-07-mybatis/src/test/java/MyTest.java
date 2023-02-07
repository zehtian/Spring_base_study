import mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class MyTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper useMapper = context.getBean("useMapper", UserMapper.class);
        for (User user : useMapper.selectUser()) {
            System.out.println(user);
        }



    }
}
