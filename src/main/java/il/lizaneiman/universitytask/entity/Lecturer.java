package il.lizaneiman.universitytask.entity;

public class Lecturer implements Teaching, UniversityMemberAction {
    String firstName;
    String secondName;
    String id;
    String specialization;
    String jobType;
    University institution;

    public Lecturer(String firstName, String lastName, String id, String specialization, String jobType, University university) {
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;
        this.specialization = specialization;
        this.jobType = jobType;
        this.institution = university;
    }


    @Override
    public void enterUniversity() {
        System.out.println("Учитель вошел в университет.");
    }

    @Override
    public void exitUniversity() {
        System.out.println("Учитель вышел из университета.");
    }

    @Override
    public void enterClass() {
        System.out.println("Учитель вошел в класс.");
    }

    @Override
    public void exitClass() {
        System.out.println("Учитель вышел из класса.");
    }

    @Override
    public void takeBreak() {
        System.out.println("Учитель вышел на перерыв в учительскую.");
    }

    @Override
    public void speak() {
        System.out.println("Учитель задает вопросы студентам на уроке.");
    }

    @Override
    public void checkHomework() {
        System.out.println("Учитель проверяет домашнее задание студентов.");
    }

    @Override
    public void beAbsent() {
        System.out.println("Учитель отсутствует сегодня.");
    }

    @Override
    public void prepareMaterial() {
        System.out.println("Учитель готовит учебный материал для следующей лекции.");
    }
}
