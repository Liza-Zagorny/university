package il.lizaneiman.universitytask._main;

import il.lizaneiman.universitytask.entity.Lecturer;
import il.lizaneiman.universitytask.entity.Student;
import il.lizaneiman.universitytask.entity.University;
import il.lizaneiman.universitytask.util.LecturerService;
import il.lizaneiman.universitytask.util.StudentService;

public class _Main {
    public static void main(String[] args) {

        University university1 = new University();
        Lecturer teacher1 = new Lecturer("Иван", "Иванов", "123", "английский", "full-time", university1);
        Student student1 = new Student(university1, teacher1, 1, "Java", "Aлиса", "Петрова", "456");
        StudentService studentService = new StudentService();
        LecturerService lecturerService = new LecturerService();

        studentService.executeStudentActions(student1);
        lecturerService.executeBasicActions(teacher1);
    }
}
