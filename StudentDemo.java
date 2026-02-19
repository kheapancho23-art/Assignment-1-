using System;

class Student
{
    public string studentID;
    public string name;
    public string course;

    // Constructor
    public Student(string studentID, string name, string course)
    {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display info
    public void displayInfo()
    {
        Console.WriteLine("Student ID: " + studentID);
        Console.WriteLine("Name: " + name);
        Console.WriteLine("Course: " + course);
        Console.WriteLine();
    }
}

class StudentDemo
{
    static void Main(string[] args)
    {
        Student s1 = new Student("2023001", "Maria Santos", "BS Computer Science");
        Student s2 = new Student("2023002", "Juan Dela Cruz", "BS Information Technology");

        s1.displayInfo();
        s2.displayInfo();
    }
}
