package you.shaoxin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import you.shaoxin.domin.Student;
import you.shaoxin.feign.impl.FeignError;

import java.util.Collection;

/**
 * @author: 游菜花 -
 * @create: 2019-08-09 17:53
 */
@FeignClient(value = "provider",fallback = FeignError.class)
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();

}
