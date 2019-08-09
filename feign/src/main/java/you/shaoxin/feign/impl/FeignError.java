package you.shaoxin.feign.impl;

import org.springframework.stereotype.Component;
import you.shaoxin.domin.Student;
import you.shaoxin.feign.FeignProviderClient;

import java.util.Collection;

/**
 * @author: 游菜花 - 熔错实现类
 * @create: 2019-08-09 18:35
 */
@Component
public class FeignError implements FeignProviderClient {

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务期维护中！";
    }
}
