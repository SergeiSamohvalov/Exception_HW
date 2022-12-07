package Seminars.Seminar2;

public class Task_1 {
    public static int sum2d(String [][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[i].length; j ++){
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Элементы" + i + " " + j + "не являются числами");
                }
            }
        }
        return sum;
    }
}
