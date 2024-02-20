package mr.green.redisbase.book;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.List;

@Data
@RedisHash(value = "people", timeToLive = 60L)
public class Book implements Serializable {

    @Id
    private String id;
    private int pageCount;
    private String thumbnail;
    private double price;
    private String subtitle;
    private String description;
    private String language;
    private String currency;
    private String title;
    private String infoLink;
    private List<String> authors;
}
