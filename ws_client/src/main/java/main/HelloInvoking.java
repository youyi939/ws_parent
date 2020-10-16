package main;

import ken.service.ServiceDemo;
import ken.service.impl.ServiceDemoImplService;
//import service.HelloWs;
//import service.HelloWsService;
//import service.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 5:34 下午
 */
public class HelloInvoking {
    public static void main(String[] args) {

        ServiceDemoImplService serviceDemoImplService = new ServiceDemoImplService();
        ServiceDemo serviceDemo = serviceDemoImplService.getServiceDemoImplPort();
        List<ken.service.User> users=  serviceDemo.findAllUser();
        for (int i = 0; i <  users.size(); i++) {
            System.out.println(users.get(i).getId()+users.get(i).getName());
        }
    }
}
