package pkg0405;

public class CallMethodExample5 {
    public static void countdown(int start, int end) {
        System.out.println("1つめの引数で受け取った値: "+ start);
        System.out.println("2つめの引数で受け取った値: "+ end);
        System.out.println("カウントダウンをします");
        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        countdown(7, 3);
    }
}
