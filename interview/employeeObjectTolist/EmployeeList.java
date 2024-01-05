package com.interview.employeeObjectTolist;

import java.util.ArrayList;
import java.util.List;

/*  Create a List to store EmployeeObje
and count number of female employees in list */

public class EmployeeList {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Arpitha", "female", "23"));
        emp.add(new Employee("yuy", "female", "23"));
        emp.add(new Employee("in", "female", "23"));

        int genderCount = 0;
        for (Employee employee : emp) {
            if ("female".equals(employee.getDob())) {
                genderCount++;
            }


        }
        System.out.println(genderCount);
    }
}
