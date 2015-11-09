import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularMatch {
    public static void main(String[] args){
        String url = "tunnelport5911wangxew";
        Pattern p = Pattern.compile("or");
        Matcher m = p.matcher(url); // find if there is a matcher
        System.out.println(m);
        
        
        /** @author: Jialiang Ni */
        String url2 = "http://192.168.1.111:8080/guacamole/tunnelport5678usernameABC";
		Pattern pattern = Pattern.compile("tunnelport([1-9]+)username([a-zA-Z]+)");
		Matcher matcher = pattern.matcher(url2);
		System.out.println("Start matching\n");
		if (matcher.find()){
			System.out.println(matcher.group(0));
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		}
    }
}