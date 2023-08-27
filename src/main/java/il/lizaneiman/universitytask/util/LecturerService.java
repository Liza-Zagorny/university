package il.lizaneiman.universitytask.util;

import il.lizaneiman.universitytask.entity.Teaching;
import il.lizaneiman.universitytask.entity.UniversityMemberAction;

public class LecturerService {
    public void executeBasicActions(UniversityMemberAction member){
        member.enterUniversity();
        member.enterClass();
        member.speak();
        member.exitClass();
        member.takeBreak();
        member.exitUniversity();
    }

    public void executeLecturerActions (Teaching lecturer){
        lecturer.beAbsent();
        lecturer.checkHomework();
        lecturer.prepareMaterial();
    }
}
