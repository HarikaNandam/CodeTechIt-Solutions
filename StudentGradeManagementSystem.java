import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private double[] grades;
    private double averageGrade;

    public Student(String name, int id, int numOfGrades) {
        this.name = name;
        this.id = id;
        this.grades = new double[numOfGrades];
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
        calculateAverageGrade();
    }

    private void calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        this.averageGrade = sum / grades.length;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = scanner.nextInt();
        System.out.print("Enter the number of grades per student: ");
        int numOfGrades = scanner.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            students[i] = new Student(name, id, numOfGrades);

            System.out.print("Enter grades for student " + (i + 1) + ": ");
            double[] grades = new double[numOfGrades];
            for (int j = 0; j < numOfGrades; j++) {
                grades[j] = scanner.nextDouble();
            }
            students[i].setGrades(grades);
        }

        System.out.println("\nStudent Details and Average Grades:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Average Grade: " + student.getAverageGrade());
            System.out.println();
        }
    }
}
