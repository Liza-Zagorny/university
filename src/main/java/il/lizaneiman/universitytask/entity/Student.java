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
        System.out.println("Студент вошел в университет.");
    }

    @Override
    public void exitUniversity() {
        System.out.println("Студент вышел из университета.");

    }

    @Override
    public void enterClass() {
        System.out.println("Студент вошел в класс.");
    }

    @Override
    public void exitClass() {
        System.out.println("Студент вышел из класса.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Студент пошел на перерыв на територии университета.");
    }

    @Override
    public void speak() {
        System.out.println("Студент отвечает на уроке.");
    }

    @Override
    public void readBook() {
        System.out.println("Студент читает книгу в библиотеке.");
    }

    @Override
    public void doHomework() {
        System.out.println("Студет выполняет домашнее задание.");
    }

    @Override
    public void skipLesson() {
        System.out.println("Студент прогуливает урок.");
    }
}
