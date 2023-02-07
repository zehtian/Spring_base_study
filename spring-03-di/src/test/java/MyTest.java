import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;
import pojo.User;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());

        /*
        Student{
            name='琴疆',
            address=Address{address='西安'},
            books=[红楼梦, 水浒传, 三国演义],
            hobbies=[听歌, 看电影],
            card={身份证=123121231313123132, 银行卡=111111111111111111},
            games=[LOL, PUBG],
            wife='null',
            info={password=123456, url=男, driver=20190525, username=root}
            }
         */
    }

    @Test
    public void testPC(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = (User) context.getBean("user2");
        System.out.println(user.toString());
    }
}
