import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularMatch {
    public static void main(String[] args){
        String url = "http://192.168.1.161:8080/wangx23/tunnel/typevnc/host192.168.1.111/port5911/usernamewangx/passwordacoman/tunnel?write:27088613-741b-4066-992a-4bb0d3edaa2b";
        Pattern pattern = Pattern.compile("type([a-zA-Z]+)/host([0-9.]+)/port([0-9]+)/username([a-zA-Z]+)/password([a-zA-Z0-9]+)");
        Matcher matcher = pattern.matcher(url);
		String type = "";
		String host = "";
		String port = "";
		String username = "";
		String password = "";
		if (matcher.find()) {
			System.out.println("find ");
			type = matcher.group(1);
			host = matcher.group(2);
			port = matcher.group(3);
			username = matcher.group(4);
			password = matcher.group(5);
		}
        System.out.println(port);
    }
}
