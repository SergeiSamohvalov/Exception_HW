package Seminars.Seminar1;

public class Main {
    private final static int MIN_LENGTH = 5;

    // Реализуйте метод, принимающий в качестве аргументв целочисленный масси.
    // Если длинна массива меньше некоторого заданного минимума, метод возвращает -1,
    // в качестве кода ошибки, иначе длинну массива.
    public static void main(String[] args) {
        System.out.println(getSize(new int[] {1,2}));
        System.out.println(getSize(new int[] {1,2,3,4,5,6}));
    }
    public static int getSize(int[] array) {
        if (array.length < MIN_LENGTH){
            return -1;
        }
        return array.length;
    }
}