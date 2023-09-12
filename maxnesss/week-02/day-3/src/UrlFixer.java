
// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it in more than one way using different String functions!
public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // method string builder insert and replace
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.insert(5,":");
        sb.replace(sb.indexOf("bots"),sb.indexOf("bots")+4,"odds");

        url = sb.toString();



        System.out.println(url);
    }
}