package pkg0700.pkg0702;

import pkg0700.pkg0701.StudentCard;

public class IStudentCard extends StudentCard {
    String nationality;

    void printInfo() {
        System.out.println("学籍番号:" + id);
        System.out.println("氏名:" + name);
        System.out.println("国籍:" + nationality);
    }
}
