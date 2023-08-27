package il.lizaneiman.universitytask.entity;

public class Student {

    University university;
    Lecturer lecturer;
    int yearOfStudying;
    String major;
    String firstName;
    String secondName;
    String id;

    public Student (University university, Lecturer lecturer, int yearOfStudying, String major, String firstName, String lastName, String id) {
        this.university = university;
        this.lecturer = lecturer;
        this.yearOfStudying = yearOfStudying;
        this.major = major;
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;
    }
}
