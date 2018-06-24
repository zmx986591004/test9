package com.example.administrator.experiment9_1;

/**
 * Created by Administrator on 2018/6/11.
 */

public class ContactPerson {
    private String name;
    private String number;

    public ContactPerson(String name,String number){
        this.name=name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
