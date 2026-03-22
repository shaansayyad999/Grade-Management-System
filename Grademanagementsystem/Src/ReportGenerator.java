import java.util.ArrayList;

public class ReportGenerator {

    public static void generateReport(ArrayList<StudentGrade> students) {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        double[] subjectAvg = new double[5];

        for (StudentGrade s : students) {
            for (int i = 0; i < 5; i++) {
                subjectAvg[i] += s.marks[i];
            }
        }

        for (int i = 0; i < 5; i++) {
            subjectAvg[i] /= students.size();
        }

        System.out.println("\n  SUBJECT AVERAGES:");
        System.out.println("Math: " + subjectAvg[0]);
        System.out.println("Science: " + subjectAvg[1]);
        System.out.println("English: " + subjectAvg[2]);
        System.out.println("History: " + subjectAvg[3]);
        System.out.println("Computer: " + subjectAvg[4]);

        students.sort((a, b) -> Double.compare(b.getAverage(), a.getAverage()));

        System.out.println("\n TOP PERFORMERS:");
        for (int i = 0; i < Math.min(3, students.size()); i++) {
            System.out.println((i+1) + ". " + students.get(i).name + " - " + students.get(i).getAverage());
        }

        int A=0,B=0,C=0,D=0,F=0;

        for (StudentGrade s : students) {
            String g = GradeCalculator.getGrade(s.getAverage());
            switch (g) {
                case "A+": case "A": A++; break;
                case "B": B++; break;
                case "C": C++; break;
                case "D": D++; break;
                default: F++;
            }
        }

        System.out.println("\n GRADE DISTRIBUTION:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("F: " + F);
    }
}