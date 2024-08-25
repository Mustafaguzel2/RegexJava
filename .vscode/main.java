import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("agent \\d{3}");
        Matcher matcher = pattern.matcher("agent 007");
        /*\\d{}bu bize sınırsız digit girme sağlar ve match eder */
        boolean found = matcher.find();

        System.out.println("found: " + found);
    }
}