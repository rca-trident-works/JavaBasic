package pkg0310;

public class BreakExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("変数sumに" + i + "を加えました。sumは" + sum);
            if (sum > 20) {
                System.out.println("変数sumが20を超えました。");
                break;
            }
        }
    }
}
