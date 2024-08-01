package org.example;

public class Person {
     String firstName;
     String lastName;
     int age;
     String email;
     String gender;
     String phoneNumber;

    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String email, String gender, String phoneNumber) {
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String lastName, int age, String email, String gender, String phoneNumber) {
        this(firstName,lastName,age);
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }
}
