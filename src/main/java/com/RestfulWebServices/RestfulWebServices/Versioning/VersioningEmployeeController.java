package com.RestfulWebServices.RestfulWebServices.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningEmployeeController {

    //URI
    @GetMapping("/v1/employee")
    public EmployeeV1 getFirstVersionOfPerson() {
        return new EmployeeV1("Rajesh Koothrapali",2);
    }

    @GetMapping("/v2/employee")
    public EmployeeV2 getSecondVersionOfPerson() {
        return new EmployeeV2(new Name("Rajesh", "Koothrapali"),2);
    }
//PARAMS
    @GetMapping(path = "/employee", params = "version=1")
    public EmployeeV1 getFirstVersionOfPersonRequestParameter() {
        return new EmployeeV1("Rajesh Koothrapali",2);
    }

    @GetMapping(path = "/employee", params = "version=2")
    public EmployeeV2 getSecondVersionOfPersonRequestParameter() {
        return new EmployeeV2(new Name("Rajesh", "Koothrapali"),2);
    }
//HEADERS
    @GetMapping(path = "/employee/header", headers = "X-API-VERSION=1")
    public EmployeeV1 getFirstVersionOfPersonRequestHeader() {
        return new EmployeeV1("Rajesh Koothrapali",2);
    }

    @GetMapping(path = "/employee/header", headers = "X-API-VERSION=2")
    public EmployeeV2 getSecondVersionOfPersonRequestHeader() {
        return new EmployeeV2(new Name("Rajesh", "Koothrapali"),2);
    }

    @GetMapping(path = "/employee/accept", produces = "application/vnd.company.app-v1+json")
    public EmployeeV1 getFirstVersionOfPersonAcceptHeader() {
        return new EmployeeV1("Rajesh Koothrapali",2);
    }

    @GetMapping(path = "/employee/accept", produces = "application/vnd.company.app-v2+json")
    public EmployeeV2 getSecondVersionOfPersonAcceptHeader() {
        return new EmployeeV2(new Name("Rajesh", "Koothrapali"),2);
    }

}
