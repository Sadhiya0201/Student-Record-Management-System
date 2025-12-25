public class Student {
    private int id;
    private String name;
    private String department;
    private int marks;
    private String grade; // New field for grade

    // Constructor
    public Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.setMarks(marks); // sets marks and grade
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getMarks() { return marks; }
    public String getGrade() { return grade; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }

    public void setMarks(int marks) {
        if (marks < 0) marks = 0;
        if (marks > 100) marks = 100;
        this.marks = marks;
        this.grade = calculateGrade(marks); // automatically assign grade
    }

    // Grade calculation
    private String calculateGrade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else return "D";
    }

    // Display student
    public void displayStudent() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Marks: " + marks +
                ", Grade: " + grade);
    }
}