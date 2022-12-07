package HomeWork_sem1;
import java.io.File;
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task_1 {
    public static void main(String[] args) {

    }

    public static int div(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Делить на НОЛЬ нельзя");
        }
        return a / b;
    }

    public static long getFileLength(String path) {
        File file = new File(path);
        if (!file.exists()) {
            return -1;
        }
        return file.length();
    }

    public static void method(Object n) {
        if (n == null) {
            throw new IllegalArgumentException("Object не может содержать null");
        }
    }
}
