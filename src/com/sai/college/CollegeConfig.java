package com.sai.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sai.college")
@PropertySource("test-info.properties")
public class CollegeConfig {

//    @Bean
//    public Teacher mathTeacherBean(){
//       return new MathTeacher();
//    }
//
//     @Bean
//    public ColPrincipal principalBean(){
//      ColPrincipal principal = new ColPrincipal();
//      return principal;
//    }
//
//    @Bean(name = "collegeBean")
//    public College collegeBean() {
//        College college = new College();
//        college.setPrincipal(principalBean());
//        college.setTeacher(mathTeacherBean());
//        return college;
//    }


}
