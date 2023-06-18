package com.geekster.Weekly_Test_1.Entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // this annotation is used to create only 1 object of the Company class.
public class Company {
    @Value("1") // This annotaion is used to pass the value to the companyId variable.
    private int CompanyId;
    @Value("Geekster")
    private String CompanyName;

    public int getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(int companyId) {
        CompanyId = companyId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyField() {
        return CompanyField;
    }

    public void setCompanyField(String companyField) {
        CompanyField = companyField;
    }

    @Value("IT")
    private String CompanyField;


}
