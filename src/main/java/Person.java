package main.java;

import java.time.LocalDate;

public class Person {


    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Integer age;

    Person(){}

    Person(String name,LocalDate birthday,Sex gender,String emailAddress,Integer age){
        this.name=name;
        this.birthday=birthday;
        this.gender=gender;
        this.emailAddress=emailAddress;
        this.age=age;
    }

    public Integer getAge() {
        return age;
    }
    public String toString() {
        return  "Person = " + name +
                ", birthday = " + birthday +
                ", gender = " + gender +
                ", Age = " + getAge() +
                ", emailAddress = " + emailAddress + "\n";
    }

    public void printPerson() {
        System.out.println(this.toString());
    }



}
