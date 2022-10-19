package com.RestfulWebServices.RestfulWebServices.Employee;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer age;
    @Size(min = 2, message = "Name should have atleast 2 characters")
    private String name;
    public Employee(Integer id,String name,Integer age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
