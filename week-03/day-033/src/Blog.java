import java.util.ArrayList;
import java.util.List;

public class Blog {
    List<BlogPost> blog = new ArrayList<>();



    Blog() {
        for (int i = 0; i < 5; i++) {
            blog.add(i, new BlogPost());
        }
    }
    void add(String title, String text, String authorName, String publicationDate) {
        blog.add(new BlogPost(title,text,authorName,publicationDate));
    }
    void delete(int a){
        blog.remove(a);
    }
    void update(int a){
        blog.set(a,new BlogPost());
    }
}
