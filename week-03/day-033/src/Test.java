public class Test {
    public static void main(String[] args) {
//        exPostIt();
//        exBlogPostEmpty();
//        exBlogPostFill("another Title","Hello there","Grivus", "not today");
//        createAnimal();
        checkSharpie();


    }

    public static void exPostIt() {
        PostIt newPost = new PostIt("red", "Hello!", "black");
        System.out.println("The bgColor of the post is " + newPost.backgroundColor);
        System.out.println("The textColor of the post is " + newPost.textColor);
        System.out.println("The text of the post is " + newPost.text + "\n");

        PostIt post2 = new PostIt("orange", "Idea 1!", "blue");
        System.out.println("The bgColor of the post is " + post2.backgroundColor);
        System.out.println("The textColor of the post is " + post2.textColor);
        System.out.println("The text of the post is " + post2.text + "\n");

        PostIt post3 = new PostIt("pink", "Awesome!", "black");
        System.out.println("The bgColor of the post is " + post3.backgroundColor);
        System.out.println("The textColor of the post is " + post3.textColor);
        System.out.println("The text of the post is " + post3.text + "\n");

        PostIt post4 = new PostIt("yellow", "Superb!", "green");
        System.out.println("The bgColor of the post is " + post4.backgroundColor);
        System.out.println("The textColor of the post is " + post4.textColor);
        System.out.println("The text of the post is " + post4.text + "\n");

    }

    public static void exBlogPostEmpty() {
        BlogPost newBlog = new BlogPost();
        System.out.println(newBlog.authorName);
        System.out.println(newBlog.text + "\n");
    }

    public static void exBlogPostFill(String title, String text, String authorName, String publicationDate) {
        BlogPost newBlog = new BlogPost(title, text, authorName, publicationDate);
        System.out.println(newBlog.authorName);
        System.out.println(newBlog.text);
        System.out.println(newBlog.title);
        System.out.println(newBlog.publicationDate + "\n");

        BlogPost blogTwo = new BlogPost("Lorem Ipsum", "Lorem ipsum dolor sit amet.",
                "John Doe", "2000.05.04.");
        BlogPost blogThree = new BlogPost("Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.",
                "Tim Urban", "2010.10.10.");
        BlogPost blogFour = new BlogPost("One Engineer Is Trying to Get IBM to Reckon With Trump",
                "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
                "William Turton", "2017.03.28.");
        System.out.println(blogFour.text);

    }

    public static void createAnimal() {
        Animal lion = new Animal();
        System.out.println("Lion's hunger is " + lion.hunger);
        System.out.println("Lion's thirst is " + lion.thirst);

        lion.drink();
        lion.eat();

        System.out.println("Lion's hunger is " + lion.hunger);
        System.out.println("Lion's thirst is " + lion.thirst);

        Animal wolf = new Animal();
        System.out.println("Wolf's hunger is " + wolf.hunger);
        System.out.println("Wolf's thirst is " + wolf.thirst);

        wolf.play();
        System.out.println("Wolf's hunger is " + wolf.hunger);
        System.out.println("Wolf's thirst is " + wolf.thirst);
//        lion.hunger = 30; // example for what can be done if class
        //variables are not private
//        System.out.println("Lion's hunger is " + lion.hunger);
    }

    public static void checkSharpie() {
        Sharpie newShar = new Sharpie("Black",1.1f);
        System.out.println("Sharpie1 ink: " + newShar.inkAmount);
        newShar.use();
        System.out.println("Sharpie1 ink: " + newShar.inkAmount);
        Sharpie newShar2 = new Sharpie("Green",1.5f);
        System.out.println("Sharpie2 ink: " + newShar2.inkAmount);
        System.out.println("Sharpie2 color: " + newShar2.color);
        System.out.println("Sharpie1 color: " + newShar.color);
    }
}