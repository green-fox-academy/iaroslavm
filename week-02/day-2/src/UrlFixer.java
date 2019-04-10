public class UrlFixer {
    public static void main(String[] args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!


        String newUrl = replace(url);

        System.out.println(newUrl);
    }

    public static String replace(String url) {
        url = url.replaceAll("//","://");
        url = url.replaceAll("bots","odds/");

        return url;
    }

}