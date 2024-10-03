import java.util.Scanner;
public class mainjava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih 1. teacher atau 2. student");
        int pilihan = in.nextInt();
        in.nextLine();
        if(pilihan == 1) {
            System.out.println("name");
            String name;
            System.out.println("Subject");
            String Subject;
            System.out.println("age");
            int age;
            System.out.println("Part Time");
            int partTime;

            teacher teacher1 = new teacher(name,age,Subject,partTime);
            teacher1.print();

        }else if (pilihan ==2) {
            System.out.println("name");
            String name;
            System.out.println("Major");
            String major;
            System.out.println("age");
            int age;
            System.out.println("Student Number");
            int Studentnumber;
            System.out.println("score");
            int score;
            student student1 = new student(name,age,Studentnumber,score,major);
            student1.print();
         }else {
            System.out.println("Input salah");
         }
    }
}