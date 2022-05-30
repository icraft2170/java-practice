package chapter_12;


public class ManageStudent {

    public chapter_08.Student[] addStudent() {
        chapter_08.Student[] students = new chapter_08.Student[3];
        students[0] = new chapter_08.Student("Lim");
        students[1] = new chapter_08.Student("Min");
        students[2] = new chapter_08.Student("Sook", "Seoul", "010xxxxxxxx", "ask@godofjava.com");
        return students;
    }

    public void printStudents(chapter_08.Student[] students) {
        for (chapter_08.Student student : students) {
            System.out.println(student);
        }
    }

    public void checkEquals() {
        Student student1 = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        Student student2 = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
        if (student1.equals(student2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equal");
        }
    }

    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        manageStudent.checkEquals();
    }

}
