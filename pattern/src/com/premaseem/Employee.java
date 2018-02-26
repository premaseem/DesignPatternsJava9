package com.premaseem;

import java.util.ArrayList;
import java.util.List;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
public class Employee {
    private String empName;
    private Integer empId;

    // Composition of same object type
    private List<Employee> subordinateEmployee = new ArrayList<>();

    public Employee (String empName, Integer empId) {
        this.empName = empName;
        this.empId = empId;
    }

    public void addSubordinate(Employee emp){
        subordinateEmployee.add(emp);
    }

    public void removeSubordinate(Employee emp){
        subordinateEmployee.remove(emp);
    }

    public void showEmployeeDetails(){

        System.out.println(toString());
    }

    @Override
    public String toString () {
        String node = subordinateEmployee.size() == 0 ? "No subordinates" : subordinateEmployee.toString();
        String level = subordinateEmployee.size() == 0 ? "Non Manger" : "Manager ";

        return  "\n"+ level +" {" +
                "empName='" + empName + '\'' +
                ",    subordinates =" + node +
                "}";
    }
}
