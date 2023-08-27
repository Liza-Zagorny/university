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
    public void checkHomework() {

    }

    ;

    @Override
    public void beAbsent() {

    }

    ;

    @Override
    public void prepareMaterial() {

    }

    ;


}
