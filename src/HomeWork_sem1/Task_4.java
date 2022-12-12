package HomeWork_sem1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение,
// которое пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        int[] array1 = {8, 16, 6, 12};
        int[] array2 = {2, 4, 24, 4};
        System.out.println(Arrays.toString(difArrays(array1, array2)));
    }

    public static float[] difArrays(int[] arr1, int[] arr2) {
<<<<<<< HEAD
        if (arr1 == null || arr2 == null) {
=======
        if (arr1 == null && arr2 == null) {
>>>>>>> origin/master
            throw new RuntimeException("Массивы не могут содержать NULL");
        }
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Массивы должны быть одной длинны");
        }

        float[] dif = new float[arr1.length];
        for (int i = 0; i < dif.length; i++) {
            dif[i] = (float) arr1[i] / (float) arr2[i];
        }
        return dif;
    }

}


