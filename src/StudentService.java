import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Add a new student
    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (findStudentIndexById(id) != -1) {
            System.out.println("Error: Student with this ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Marks (0-100): ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(id, name, department, marks);
        students.add(student);
        System.out.println("Student added successfully!");

        displayTotalStudents();
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.displayStudent();
        }
    }

    // Search student by ID
    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = findStudentIndexById(id);
        if (index != -1) {
            students.get(index).displayStudent();
        } else {
            System.out.println("Student not found.");
        }
    }

    // Update student info
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = findStudentIndexById(id);
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        Student s = students.get(index);
        System.out.print("Enter new Name: ");
        s.setName(scanner.nextLine());
        System.out.print("Enter new Department: ");
        s.setDepartment(scanner.nextLine());
        System.out.print("Enter new Marks (0-100): ");
        s.setMarks(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Student updated successfully!");
    }

    // Delete student
    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        int index = findStudentIndexById(id);
        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }
        students.remove(index);
        System.out.println("Student deleted successfully!");
        displayTotalStudents();
    }

    // Find student index by ID
    private int findStudentIndexById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) return i;
        }
        return -1;
    }

    // Display total students
    private void displayTotalStudents() {
        System.out.println("Total students: " + students.size());
    }
}