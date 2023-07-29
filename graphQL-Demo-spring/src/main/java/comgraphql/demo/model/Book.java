package comgraphql.demo.model;


import lombok.Data;

@Data
public class Book {

    private Integer id;
    private String name;

    private String pageCount;
    private String author;
}
