package pkg0700.pkg0701;

public class InheritanceExample {
    public static void main(String[] args) {
        IStudentCard a = new IStudentCard();
        a.id = 2345;
        a.name = "John Smith";
        a.nationality = "イギリス";
        a.printInfo();
    }
}
