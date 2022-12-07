package HomeWork_sem1;
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class Task_2 {
    public static void main(String[] args) {
        String[][] array = {{}, {}};
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

//    Типы исключений, которые можно получить:
// - исключение ArrayIndexOutOfBoundsException
// - Несовместимые типы
// - Пустой массив
// - Исключение ФорматаЧисла
