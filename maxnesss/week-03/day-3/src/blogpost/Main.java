package blogpost;

public class Main {
    public static void main(String[] args) {
        BlogPost post = new BlogPost();
        post.authorName = "Max";
        post.text = "Lorem Ipsum";
        post.title= "LOREM IPSUM";
        post.publicationDate = "1989.03.07";

        Blog b = new Blog();
        b.add(post);
        b.add(post);
        b.add(post);
        b.add(post);
        b.add(post);
        System.out.println(b.listOfBlogs.size());
        b.delete(3);
        System.out.println(b.listOfBlogs.size());
        b.update(2,post);
    }

}
