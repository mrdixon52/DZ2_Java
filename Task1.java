import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 10, -2, 20, 1, 0 };
        String file_name = "Task1.txt";
        File file = new File(file_name);
        try {
            FileWriter writer = new FileWriter(file, false);
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                writer.write(ListToString(arr));
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!");
        } catch (Exception e) {
            System.out.println("Что-то пошло не так");
        }
    }

    public static String ListToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]).append(", ");
        }
        return sb.toString();
    }
}