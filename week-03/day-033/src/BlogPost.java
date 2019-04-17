public class BlogPost {
    String authorName = "Iaroslav";
    String title = "Title";
    String text = "Some text";
    String publicationDate = "Today";

    BlogPost() {

    }

    BlogPost(String title, String text, String authorName, String publicationDate) {
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.text = text;
        this.title = title;
    }
}
