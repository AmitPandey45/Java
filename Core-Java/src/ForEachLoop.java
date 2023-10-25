package src;
public class ForEachLoop {
    public static void main(String[] args) {
        var students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            var student = new Student();
            student.name = "Student " + (10 + i);
            student.rollNumber = 100 + i;
            student.marks = (int) (Math.random() * 100);
            students[i] = student;
        }

        for (var student : students) {
            System.out
                    .println("Name: " + student.name + " Roll Number:" + student.rollNumber + " Mark:" + student.marks);
        }
    }
}
