package service.impl;

import service.HelloWs;

import javax.jws.WebService;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 1:53 下午
 */
@WebService
public class HelloWsImpl implements HelloWs {
    @Override
    public String sayHelloWs(String str) {
        return str + " Hello WebService ！";
    }
}
