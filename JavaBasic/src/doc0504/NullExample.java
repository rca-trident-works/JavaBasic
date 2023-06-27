package doc0504;

class StudentCard {
    int id; //学籍番号
    String name; //氏名
}
public class NullExample {
    public static void main(String[] args) {
        StudentCard[] cards = new StudentCard[3];

        cards[1] = new StudentCard();
        cards[1].id = 1235;
        cards[1].name = "佐藤花子";

        for (int i = 0; i < 3; i++) {
            if (cards[i] == null) {
                System.out.println("cards[" + i + "]は参照がありません");
            }
            else {
                System.out.println("cards[" + i + "]の" + "idは" + cards[i].id + ", nameは" + cards[i].name);
            }
        }
    }
}
