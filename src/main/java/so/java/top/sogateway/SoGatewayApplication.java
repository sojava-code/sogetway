package so.java.top.sogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *
 * @author: soJava
 * @date: 2020/6/2 14:42
 * @desc: so-网关
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoGatewayApplication.class, args);
    }

}
