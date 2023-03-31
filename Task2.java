import java.io.BufferedReader;
import java.io.FileReader;

public class Task2 {
    public static void main(String[] args) throws Exception {

        String dataFile = "Task2.txt";
        String[] information;
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(dataFile));
            String line;
            {
                while ((line = br.readLine()) != null) {
                    information = line.replace("\"", "").split(":|,");
                    sb.append("Студент ").append(information[1]).append(" получил ").append(information[3])
                            .append(" по предмету ").append(information[5]).append(".\n");
                }
                System.out.println(sb);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}