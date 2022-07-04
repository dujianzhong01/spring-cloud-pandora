package cn.com.pandora.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @描述：
 * @作者：dujianzhong
 * @时间：2022/7/4
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);

        System.out.println("服务监控访问地址   http://localhost:8761");
    }
}
