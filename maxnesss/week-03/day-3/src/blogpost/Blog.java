package blogpost;

import java.util.ArrayList;
import java.util.List;

/*
Reuse your BlogPost class
Create a Blog class which can:
store a list of BlogPosts
and has the following methods:
add(BlogPost) -> adds a BlogPost to the list
delete(int) -> deletes the BlogPost from the given index
update(int, BlogPost) -> replaces an item at the given index with a new BlogPost
 */
public class Blog {
    List<BlogPost> listOfBlogs = new ArrayList<>();

    public void add(BlogPost blogPost){
        listOfBlogs.add(blogPost);
    }
    public void delete(int index){
        listOfBlogs.remove(index);
    }
    public void update(int index, BlogPost blogPost){
        listOfBlogs.remove(index);
        listOfBlogs.add(index, blogPost);
    }
}
