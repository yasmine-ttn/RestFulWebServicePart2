package com.RestfulWebServices.RestfulWebServices.Versioning;

import com.RestfulWebServices.RestfulWebServices.Employee.Employee;

public class EmployeeV1 {
    private String name;
    private int id;

    public EmployeeV1(String name,int id) {
        super();
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonV1 [name=" + name + " id="+id+"]";
    }

}