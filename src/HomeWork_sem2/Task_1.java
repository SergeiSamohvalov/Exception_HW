package HomeWork_sem2;
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных. В этом задании не используем try catch.
// Пишем регулярное выражение и используем на строке метод matches.

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        while (!iScanner.hasNextFloat()) {
            System.out.print("Это не дробное число, попробуйте еще раз: ");
            iScanner.next();
        }
        System.out.printf("Вы ввели число: %f", iScanner.nextFloat());
        iScanner.close();
    }
}
