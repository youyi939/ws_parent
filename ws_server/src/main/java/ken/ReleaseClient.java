package ken;
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
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        // 设置地址
        jaxWsServerFactoryBean.setAddress(address);
        // 设置接口
        jaxWsServerFactoryBean.setServiceClass(HelloWs.class);
        // 设置实现类
        jaxWsServerFactoryBean.setServiceBean(helloWs);
        jaxWsServerFactoryBean.create();
        System.out.println("WS 服务端 started~~~~~~~");

//        Endpoint.publish(address,helloWs);

    }
}


