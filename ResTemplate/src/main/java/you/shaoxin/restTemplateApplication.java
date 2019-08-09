package you.shaoxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: 游菜花 -
 * @create: 2019-08-08 23:36
 */
@SpringBootApplication
public class restTemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(restTemplateApplication.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
