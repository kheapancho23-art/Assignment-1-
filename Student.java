
class Student {
    String studentID;
    String name;
    String course;

    // Constructor
    public Student(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student info
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating two Student objects
        Student s1 = new Student("2023001", "Maria Santos", "BS Computer Science");
        Student s2 = new Student("2023002", "Juan Dela Cruz", "BS Information Technology");

        // Calling displayInfo()
        s1.displayInfo();
        s2.displayInfo();
    }
}
