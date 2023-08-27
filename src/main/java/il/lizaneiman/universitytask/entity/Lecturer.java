package il.lizaneiman.universitytask.entity;

public class Lecturer {
    String firstName;
    String secondName;
    String id;
    String specialization;
    String jobType;
    University institution;

    public Lecturer (String firstName, String lastName, String id, String specialization, String jobType, University university){
        this.firstName = firstName;
        this.secondName = lastName;
        this.id = id;
        this.specialization = specialization;
        this.jobType = jobType;
        this.institution = university;
    }

}
