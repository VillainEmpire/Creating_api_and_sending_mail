package com.geekster.Weekly_Test_1.Controller;

import com.geekster.Weekly_Test_1.Entity.Student;

import com.geekster.Weekly_Test_1.SendMail.MailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.Transport;

@RestController  // this annotation is used where we are making the endpoint of the api's. this  annotation is
// the combination of @Controller and @ResponseBody.
public class StudentController {
    @Autowired//This annotation is used to bind the object of the student class with this reference of student.
    Student s1;


    @Autowired
    MailHandler mailHandler;


    @GetMapping("getStudent")  // this annotaion is used to get the object(Read)
    public Student getStudent(){
        System.out.println(s1.toString());
        return s1;

    }

    @GetMapping("getStudentName")
    public String getName(){
        mailHandler.sendMail(s1);
        return s1.getName();
    }
}
