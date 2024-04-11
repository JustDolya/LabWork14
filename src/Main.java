import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern ipPatt = Pattern.compile("((25[0-5]|2[0-4]\\d|1?\\d?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1?\\d?\\d)");
        System.out.print("Введите строку: ");
        String ipStr = input.nextLine();
        Matcher ip = ipPatt.matcher(ipStr);
        while (ip.find()) {
            System.out.println(ip.group());
        }
    }
}