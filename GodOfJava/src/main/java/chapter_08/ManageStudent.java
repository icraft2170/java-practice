package chapter_08;

public class ManageStudent {

    public Student[] addStudent() {
        Student[] students = new Student[3];
        students[0] = new Student("Lim");
        students[1] = new Student("Min");
        students[2] = new Student("Sook", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
        return students;
    }

    public void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Student[] student = null;
        ManageStudent manageStudent = new ManageStudent();
        student = manageStudent.addStudent();
        manageStudent.printStudents(student);
    }
}
