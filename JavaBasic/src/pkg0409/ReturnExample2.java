package pkg0409;

public class ReturnExample2 {
    public static boolean isPositiveNumber(int i) {
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int i = -10;
        if (isPositiveNumber(i)) {
            System.out.println("iの値は正です");
        } else {
            System.out.println("iの値は負またはゼロです");
        }
    }
}
