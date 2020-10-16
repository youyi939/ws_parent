package service;

import ken.entitis.User;

import javax.jws.WebService;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 1:52 下午
 */

//@WebService
public interface HelloWs {
    public String sayHelloWs(String str);
    public List<User> findAllUser();
}
