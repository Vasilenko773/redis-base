package mr.green.redisbase.user;

import java.util.UUID;

public record User(UUID id, String password, String name, String email) {

}