package Seminars.Seminar2;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\ssi19\\IdeaProjects\\Exception_HW" +
                "\\src\\Seminars\\Seminar2\\test");
        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner scan = new Scanner(fileReader);
        String[] s = new String[2];

        while (scan.hasNextLine()) {
            s = scan.nextLine().split("=");
            try {
                hashMap.put(s[0], Integer.valueOf(s[1]));
            } catch (NumberFormatException e) {
                hashMap.put(s[0], s[0].length());
            }
        }
        fileReader.close();
        System.out.println(hashMap);
    }
}
