package mr.green.redisbase.user;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Data
@RedisHash
public class User implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private UUID id;
    private String password;
    private String name;
    private String email;
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        this.roles.add(role);
    }
}