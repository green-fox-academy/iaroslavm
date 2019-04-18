public class BlogTest {
    public static void main(String[] args){
        Blog newBlog = new Blog();
        System.out.println(newBlog.blog.size());

        newBlog.add("First","Hello There","Me","today");
        System.out.println(newBlog.blog.get(5).text);
        newBlog.delete(0);
        System.out.println(newBlog.blog.size());
        newBlog.update(4);
        System.out.println(newBlog.blog.get(4).text);

    }
}
