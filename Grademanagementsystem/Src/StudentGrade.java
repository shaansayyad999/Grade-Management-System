public class StudentGrade {

    String name;
    double[] marks = new double[5];

    public StudentGrade(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        double sum = 0;
        for (double m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
}