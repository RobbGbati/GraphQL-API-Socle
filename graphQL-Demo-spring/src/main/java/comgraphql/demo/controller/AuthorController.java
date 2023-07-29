package comgraphql.demo.controller;

import comgraphql.demo.dao.PostDao;
import comgraphql.demo.model.Author;
import comgraphql.demo.model.Post;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    private final PostDao postDao;

    public AuthorController(PostDao postDao) {
        this.postDao = postDao;
    }

    public List<Post> posts(Author author) {
        return postDao.getAuthorPosts(author.getId());
    }
}
