package com.sai.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
    @Value("${college.name}")
    private String collegeName;

    @Autowired
    private ColPrincipal colPrincipal;

    @Autowired
    @Qualifier("mathTeacher")
    private Teacher teacher;

    @Required
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
//
//    public void setPrincipal(ColPrincipal colPrincipal) {
//        this.colPrincipal = colPrincipal;
//    }

//    public College(ColPrincipal principal) {
//        this.principal = principal;
//    }

    public void test() {
        colPrincipal.principalInfo();
        teacher.Teach();

        System.out.println("Test method is called " +collegeName);
    }


}
