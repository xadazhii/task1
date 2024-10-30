import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the studentID, name, surname, age: ");
        Student student = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(student.getInfo());

        System.out.println("Enter the name, surname, age: ");
        Employer employer = new Employer(sc.next(), sc.next(), sc.nextInt());
        System.out.println(employer.getInfo());

    }
}
