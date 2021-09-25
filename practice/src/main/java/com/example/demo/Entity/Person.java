package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long personId;
    private String personName;
    private String personAge;
    private String personEmail;
    private Long personPhone;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public Long getPersonPhone() {
        return personPhone;
    }

    public void setPersonPhone(Long personPhone) {
        this.personPhone = personPhone;
    }

    public Person(){
    }

    public Person(Long personId, String personName, String personAge, String personEmail, Long personPhone) {
        this.personId = personId;
        this.personName = personName;
        this.personAge = personAge;
        this.personEmail = personEmail;
        this.personPhone = personPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", personAge='" + personAge + '\'' +
                ", personEmail='" + personEmail + '\'' +
                ", personPhone=" + personPhone +
                '}';
    }
}
