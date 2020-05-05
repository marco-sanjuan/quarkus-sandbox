package com.marco.quarkussandbox.person;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {

    @NotNull
    private String name;
    private String lastName;
    @Min(18)
    private Integer age;
    private Boolean hasPet;

    public Person() {
    }

    public Person(String name, String lastName, Integer age, Boolean hasPet) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hasPet = hasPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getHasPet() {
        return hasPet;
    }

    public void setHasPet(Boolean hasPet) {
        this.hasPet = hasPet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", hasPet=" + hasPet +
                '}';
    }
}
