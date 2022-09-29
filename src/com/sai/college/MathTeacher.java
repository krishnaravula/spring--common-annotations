package com.sai.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
    @Override
    public void Teach() {
        System.out.println("Im Math Teacher and Im Sai");
    }
}
