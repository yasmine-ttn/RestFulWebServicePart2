package com.RestfulWebServices.RestfulWebServices.Versioning;

import com.RestfulWebServices.RestfulWebServices.Employee.Employee;

public class EmployeeV2 {
    private Name name;
    private int id;


    public EmployeeV2(Name name,int id) {
        super();
        this.name = name;
        this.id=id;

    }

    public Name getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonV2 [name=" + name + " id="+id+"]";
    }

}