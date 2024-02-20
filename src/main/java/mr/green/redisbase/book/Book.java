package mr.green.redisbase.book;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
public class Book implements Serializable {

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
