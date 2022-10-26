package com.RestfulWebServices.RestfulWebServices.Filtering;


import java.util.Arrays;
import java.util.List;

import com.RestfulWebServices.RestfulWebServices.Employee.Employee;
import com.RestfulWebServices.RestfulWebServices.Employee.EmployeeDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController1 {


    @GetMapping("/filtering-user") //field2, field3
    public MappingJacksonValue filteringList() {
        List<User> list = Arrays.asList(new User("Kenny Sebastian",25, "Kenny123"),
                new User("Kunal Nayyar",30, "kunal234"));
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("name","age");

        FilterProvider filters =
                new SimpleFilterProvider().addFilter("SomeUserFilter", filter );

        mappingJacksonValue.setFilters(filters );


        return mappingJacksonValue;

    }

//    @GetMapping("/filtering-user") //field2, field3
//    public List<User> filteringList() {
//        List<User> list = Arrays.asList(new User("Kenny Sebastian", 25, "Kenny123"),
//                new User("Kunal Nayyar", 30, "kunal234"));
//        return list;
//    }

}