package com.geekster.Weekly_Test_1.Controller;

import com.geekster.Weekly_Test_1.Entity.Company;
import com.geekster.Weekly_Test_1.SendMail.MailHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    Company c1 ;

    @GetMapping("companyDetails")
    public Company getCompanyDetails(){
        return c1;
    }

    @GetMapping("companyId")
    public int getId(){
        return c1.getCompanyId();
    }

    @GetMapping("companyName")
    public String  getcompanyName(){
        return c1.getCompanyName();
    }

}
