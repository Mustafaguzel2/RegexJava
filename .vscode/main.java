import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[aA]gent \\d{3,5}$");
        Matcher matcher = pattern.matcher("agent 0214");
        /* 1. \\d{}bu bize sınırsız digit girme sağlar ve match eder 
         * 2. ^ eğer bu işaret başında olursa ve $ bu işarette sonunda olursa
         * sadece bizim yazdığımız regex şekli true döner ancak başında
         * veya sonunda bunlar olmazsa içinde bizim regex kodumuzun olması
         * true dönmesi için yeterli olur.
         * 3. [0-9] ibaresi hangi rakamların kabul göreceğini söyler.
         * [0-9]{3,5} gibi kullanılması gerekir.
         * 4. '.' her türlü karakteri temsil eder.
         * 5. [aA] ise hangi karakterlerin kabul göreceğini gösterir.
         * 6. (a|A|aa) ifadesi birden fazla karakterin aynı anda
         * kabul görmesini sağlar.
         * [abc] a veya b veya c kabul görür.
         * [a-z] arasındaki harfler kabul görür. (fakat non-Capslock)
         * 
        */

        boolean found = matcher.find();

        System.out.println("found: " + found);
    }
}