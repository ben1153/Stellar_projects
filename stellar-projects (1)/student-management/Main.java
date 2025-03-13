import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    private static ArrayList<Student> students = new ArrayList<>();
    
    public static void addStudent(String name, int id, int age) {
        students.add(new Student(name, id, age));
    }
    
    public static void displayStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
    
    public static void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Age: ");
                int age = scanner.nextInt();
                addStudent(name, id, age);
            } else if (choice == 2) {
                displayStudents();
            } else if (choice == 3) {
                System.out.print("Enter ID to remove: ");
                int id = scanner.nextInt();
                removeStudent(id);
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
