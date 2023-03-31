import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file_name = "Task3.txt";
        File file = new File(file_name);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter sign(+, -, *, /): ");
        String sign = sc.next();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int result = 0;
        sc.close();
        if (sign.equals("+")) {
            result = a + b;
        } else if (sign.equals("-")) {
            result = a - b;
        } else if (sign.equals("*")) {
            result = a * b;
        } else if (sign.equals("/")) {
            result = a / b;
        } else {
            System.out.print("Error. Enter signs like +, -, *, /");
        }
        System.out.print("Result = " + result);
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(ListCalc(a, b, result, sign));
            writer.write("\n");
            writer.close();
            System.out.println("\nПолучилось!");
        } catch (Exception e) {
            System.out.println("\nЧто-то пошло не так");
        }
    }
    public static String ListCalc(int a, int b, int result, String sign) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(sign).append(" ").append(b).append(" = ").append(result);
        return sb.toString();
    }
}
