import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("agent \\d{3,5}");
        Matcher matcher = pattern.matcher("agent 0075");
        /*\\d{}bu bize sınırsız digit girme sağlar ve match eder 
         * ^ eğer bu işaret başında olursa ve $ bu işarette sonunda olursa
         * sadece bizim yazdığımız regex şekli true döner ancak başında
         * veya sonunda bunlar olmazsa içinde bizim regex kodumuzun olması
         * true dönmesi için yeterli olur.
        */

        boolean found = matcher.find();

        System.out.println("found: " + found);
    }
}