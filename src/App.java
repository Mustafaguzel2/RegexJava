import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        
        Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
        Matcher matcher = pattern.matcher("10 divided by 2");
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
         * 7. \\w* herhangi bir karakterin kullanımını söyler[a-zA-Z_0-9].
         * agent007 ag007 gibi ifadeler true
         * \\w+ bir veya daha fazla eşleşme varsa true döner.
         * agent007 true
         * \\w? bir veya daha az eşleşme varsa true döner.
         * 007 true veya t007 true
         * 
        */

        if(matcher.find()){
            String simplified = "result: " + matcher.replaceFirst("$1/$2");
            System.out.println(simplified); 
            int result = Integer.valueOf(matcher.group(1))/Integer.valueOf(matcher.group(2));
            System.out.println("result = " + result);
        }
    }
}