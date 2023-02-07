package service;

import dao.UserDao;

public class UserServiceImpl implements UserService{

    //利用set进行动态实现值的注入，避免采用不同的接口
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser(){
        userDao.getUser();
    }

}
