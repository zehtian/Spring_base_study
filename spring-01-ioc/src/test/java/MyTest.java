import dao.UserDaoMysqlImpl;
import service.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {

        //用户实际调用的是业务层，dao层不需要接触
        UserServiceImpl userService = new UserServiceImpl();

        //现在：用户可以根据自己的需要进行设置，而业务层代码不需要变化
//        userService.setUserDao(new UserDaoImpl());
        userService.setUserDao(new UserDaoMysqlImpl());

        userService.getUser();

    }
}
