package il.lizaneiman.universitytask.entity;

public class Student implements UniversityMemberAction, Studying {

    University university;
    Lecturer lecturer;
    int yearOfStudying;
    String major;
    String firstName;
    String secondName;
    String id;

    public Student(University university, Lecturer lecturer, int yearOfStudying, String major, String firstName, String lastName, String id) {
        this.university = university;
        this.lecturer = lecturer;
        this.yearOfStudying = yearOfStudying;
        this.major = major;
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;
    }

    @Override
    public void enterUniversity() {

    }

    @Override
    public void exitUniversity() {

    }

    ;

    @Override
    public void enterClass() {

    }

    ;

    @Override
    public void exitClass() {

    }

    ;

    @Override
    public void takeBreak() {

    }

    ;

    @Override
    public void speak() {

    }

    ;

    @Override
    public void readBook() {

    }

    ;

    @Override
    public void doHomework() {

    }

    ;

    @Override
    public void skipLesson() {

    }

    ;

}
