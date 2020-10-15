package service;

import javax.jws.WebService;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 1:52 下午
 */

@WebService
public interface HelloWs {
    public String sayHelloWs(String str);
}
