package pkg0503;

class StudentCard {
    int id; // 学籍番号
    String name; // 氏名
}

public class InstanceArrayExample {
    public static void main(String[] args) {
        StudentCard[] cards = new StudentCard[3];
        cards[0] = new StudentCard();
        cards[0].id = 1234;
        cards[0].name = "鈴木太郎";
        cards[1] = new StudentCard();
        cards[1].id = 1235;
        cards[1].name = "佐藤花子";
        cards[2] = new StudentCard();
        cards[2].id = 1236;
        cards[2].name = "山田二郎";

        for (int i = 0; i < 3; i++) {
            System.out.println("cards[" + i + "]の" + "idは" + cards[i].id + ", nameは" + cards[i].name);
        }
    }
}
