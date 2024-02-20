package mr.green.redisbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RedisBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisBaseApplication.class, args);
    }

}
