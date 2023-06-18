package com.geekster.Weekly_Test_1.Configuration;

import com.geekster.Weekly_Test_1.Entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration   //This annotation is used on a class in which we are creating beans(objects) of anyclass.
public class ConfigureStudent {

    @Bean  // this annotation is used to call the object which is creating the object of a class
    @Primary // this annotation is used to bind this object first when we have more than 1 object available
    // for the same class.
    public Student getStudentObject1(){
        return new Student(1,"Vipin","Gurugram");
    }
    @Bean
    public Student getStudentObject2(){
        return new Student(2,"Manish","Gurugram");
    }


}
