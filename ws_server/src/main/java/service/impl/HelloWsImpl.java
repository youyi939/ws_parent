package service.impl;

import ken.entitis.User;
import service.HelloWs;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 1:53 下午
 */
//@WebService
public class HelloWsImpl implements HelloWs {
    @Override
    public String sayHelloWs(String str) {
        return str + " Hello WebService ！";
    }

    @Override
    public List<User> findAllUser() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"abc"));
        userList.add(new User(2,"efg"));
        userList.add(new User(3,"hij"));
        return userList;
    }
}
