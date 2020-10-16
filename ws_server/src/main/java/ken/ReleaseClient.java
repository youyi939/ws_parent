package ken;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import service.HelloWs;
import service.impl.HelloWsImpl;


import javax.xml.ws.Endpoint;

/**
 * @version 1.0
 * @author: KenChen
 * @date 2020/10/15 1:54 下午
 */
public class ReleaseClient {
    public static void main(String[] args) {
        System.out.println("WS 服务端 start~~~~~~");
        String address = "http://localhost:8090/sayhello";
        HelloWs helloWs = new HelloWsImpl();

        //第一种发布方式：
        Endpoint.publish(address,helloWs);

        //第二种方式
//        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
//        // 设置地址
//        jaxWsServerFactoryBean.setAddress(address);
//        // 设置接口
//        jaxWsServerFactoryBean.setServiceClass(HelloWs.class);
//        // 设置实现类
//        jaxWsServerFactoryBean.setServiceBean(helloWs);
//        jaxWsServerFactoryBean.create();

//        ServerFactoryBean serverFactoryBean = new ServerFactoryBean();
//        //设置服务接口类
//        serverFactoryBean.setServiceClass(HelloWs.class);
//        serverFactoryBean.setAddress(address);
//        serverFactoryBean.setServiceBean(helloWs);
//        serverFactoryBean.create();


        System.out.println("WS 服务端 started~~~~~~~");



    }
}


