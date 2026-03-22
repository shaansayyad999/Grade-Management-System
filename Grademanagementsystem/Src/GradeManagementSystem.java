import java.util.*;

public class GradeManagementSystem {

    static ArrayList<StudentGrade> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=== GRADE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View All Students");
            System.out.println("3. Calculate Averages");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    showAverages();
                    break;

                case 4:
                    ReportGenerator.generateReport(students);
                    break;

                case 5:
                    return;
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        double[] marks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks subject " + (i+1) + ": ");
            marks[i] = sc.nextDouble();
        }

        sc.nextLine();

        students.add(new StudentGrade(name, marks));
        System.out.println("Added successfully!");
    }

    static void viewStudents() {

        for (StudentGrade s : students) {
            System.out.print(s.name + " -> ");
            for (double m : s.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static void showAverages() {

        for (StudentGrade s : students) {
            double avg = s.getAverage();
            System.out.println(s.name + " Avg: " + avg + " Grade: " + GradeCalculator.getGrade(avg));
        }
    }
}