import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some text: ");
        String text = sc.nextLine();
        System.out.println(shortText(text));
        sc.close();
    }

    public static String shortText(String text) {
        String result = "";
        int count = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                result = result + text.charAt(i - 1) + count;
                count = 1;
            }
        }
        result = result + text.charAt(text.length() - 1) + count;

        if (text.length() == result.length()) {
            return text;
        }
        return result;
    }

}
