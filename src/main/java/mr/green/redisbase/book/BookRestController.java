package mr.green.redisbase.book;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookRestController {

    private final RedisTemplate<String, Book> redisTemplate;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addBook(@RequestBody Book book) {
        redisTemplate.opsForValue().set(book.getId(), book);
    }

    @GetMapping("/{id}")
    public Book bookWithId(@PathVariable String id) {
        return redisTemplate.opsForValue().get(id);
    }
}
