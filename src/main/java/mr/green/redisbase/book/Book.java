package mr.green.redisbase.book;

import java.util.List;

public record Book(String id, int pageCount, String thumbnail, double price, String subtitle,
                   String description, String language, String currency, String title,
                   String infoLink, List<String> authors) {


}
