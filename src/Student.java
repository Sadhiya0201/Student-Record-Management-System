public class Student {

    private int id;
    private String name;
    private String department;
    private int marks;

    public Student(int id, String name, String department, int marks) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void displayStudent() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Marks: " + marks);
    }
}