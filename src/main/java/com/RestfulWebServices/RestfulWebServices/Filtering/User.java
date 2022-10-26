package com.RestfulWebServices.RestfulWebServices.Filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonFilter("SomeUserFilter")
public class User {
    private String name;

    private Integer age;

    @JsonIgnore
    private String password;

    public User(String name, Integer age, String password) {
        super();
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User [Name=" + name + ", Age=" + age + ", Password=" + password + "]";
    }

}
