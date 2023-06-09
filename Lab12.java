import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
 
public class Lab12 {
    public static void main(String[] args) {
        System.out.print("Введите строку с IP адресом: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        Pattern p = Pattern.compile("(((25[0-5])|(2[0-4]\\d)|(1\\d\\d)|\\d{1,2})\\.){3}(((25[0-5])|(2[0-5]\\d)|(1\\d\\d)|\\d{1,2}))");
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println(input.substring(m.start(), m.end()));
        }
    }
}