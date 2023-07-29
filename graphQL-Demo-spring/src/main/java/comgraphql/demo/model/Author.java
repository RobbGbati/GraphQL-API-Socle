package comgraphql.demo.model;

import lombok.Data;


@Data
public class Author {

    private String id;
    private String name;
    private String thumbnail;

    private Integer bookId;


}
