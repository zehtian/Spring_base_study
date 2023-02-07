package service;

import dao.UserDao;

public class UserServiceImpl implements UserService{

    //原始情况：需要根据用户的不同需求调整业务层的代码
//    private UserDao userDao = new UserDaoImpl();
//    private UserDao userDao = new UserDaoMysqlImpl();


    //现在：利用set进行动态实现值的注入，避免采用不同的接口
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }

}
