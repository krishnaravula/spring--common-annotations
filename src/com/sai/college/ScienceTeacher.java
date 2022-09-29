package com.sai.college;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ScienceTeacher implements Teacher{
    @Override
    public void Teach() {
        System.out.println("Im Science Teacher and Im krishna");
    }
}
