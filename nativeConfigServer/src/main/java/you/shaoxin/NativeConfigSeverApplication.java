package you.shaoxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author: 游菜花 -
 * @create: 2019-08-09 20:03
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigSeverApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigSeverApplication.class,args);
    }
}
