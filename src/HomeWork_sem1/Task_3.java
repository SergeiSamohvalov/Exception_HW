package HomeWork_sem1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен разности элементов
//        двух входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        int[] array1 = {6, 3, 8};
        int[] array2 = {4, 5, 7};
        System.out.println(Arrays.toString(difArrays(array1, array2)));

    }

    public static int[] difArrays(int[] arr1, int[] arr2) {

        if (arr1 == null || arr2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы должны быть одной длинны");
        }

        int[] dif = new int[arr1.length];
        for (int i = 0; i < dif.length; i++) {
            dif[i] = arr1[i] - arr2[i];
        }
        return dif;
    }

}

