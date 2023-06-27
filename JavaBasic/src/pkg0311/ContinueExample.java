package pkg0311;

public class ContinueExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // iが偶数の場合
                continue; // 以降の処理をスキップ
            }
            sum += i;
            System.out.println("変数numに" + i + "を加えました。sumは" + sum);
        }
    }
}
