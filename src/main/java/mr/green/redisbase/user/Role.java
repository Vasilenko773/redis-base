package mr.green.redisbase.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.UUID;

@Data
@RedisHash
@AllArgsConstructor
public class Role {

    @Id
    private UUID id;
    private String name;

    public static Role admin() {
        return new Role(UUID.randomUUID(), "ADMIN");
    }

}
