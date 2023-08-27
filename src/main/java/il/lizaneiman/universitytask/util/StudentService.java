package il.lizaneiman.universitytask.util;

import il.lizaneiman.universitytask.entity.Studying;
import il.lizaneiman.universitytask.entity.UniversityMemberAction;

public class StudentService {
    public void executeBasicActions(UniversityMemberAction member){
        member.enterUniversity();
        member.enterClass();
        member.speak();
        member.enterClass();
        member.takeBreak();
        member.exitUniversity();
    }

    public void executeStudentActions (Studying student){
        student.doHomework();
        student.readBook();
        student.skipLesson();
    }
}
