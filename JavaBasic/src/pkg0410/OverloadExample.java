package pkg0410;

public class OverloadExample {
    public static void methodA() {
        System.out.println("引数はありません");
    }

    public static void methodA(int i) {
        System.out.println("int型の引数" + i + "を受け取りました");
    }

    public static void methodA(double d) {
        System.out.println("double型の引数" + d + "を受け取りました");
    }

    public static void methodA(String s) {
        System.out.println("String型の引数" + s + "を受け取りました");
    }

    public static void main(String[] args) {
        methodA();
        methodA(1);
        methodA(0.1);
        methodA("Hello");
    }
}
