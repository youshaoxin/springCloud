package you.shaoxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: 游菜花 - 启动类
 * @create: 2019-08-08 17:43
 */
@SpringBootApplication  //声明该类是 Spring Boot 服务的入口。
@EnableEurekaServer     //声明该类是⼀个 Eureka Server 微服务，提供服务注册和服务发现功能，即 注册中心。
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }

}
