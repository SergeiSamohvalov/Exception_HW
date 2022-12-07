package HomeWork_sem2;
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя. (try быть не должно)
import java.util.*;
public class Task_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        str = str.trim();
        if(str.isEmpty())
            throw new IllegalArgumentException("Пустую строку вводить нельзя.");
        else
            System.out.println(str);
    }
}
