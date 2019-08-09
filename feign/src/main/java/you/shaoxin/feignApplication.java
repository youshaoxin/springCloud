package you.shaoxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: 游菜花 -
 * @create: 2019-08-09 17:39
 */
@SpringBootApplication
@EnableFeignClients
public class feignApplication {
    public static void main(String[] args) {
        SpringApplication.run(feignApplication.class,args);
    }
}
