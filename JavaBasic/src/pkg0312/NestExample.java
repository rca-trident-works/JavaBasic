package pkg0312;

public class NestExample {
    public static void main(String[] args) {
        for (int a = 0; a <= 3; a++) {
            System.out.println("a = " + a);
            for (int b = 0; b <= 3; b++) {
                System.out.println("    b = " + b);
            }
        }
    }
}
