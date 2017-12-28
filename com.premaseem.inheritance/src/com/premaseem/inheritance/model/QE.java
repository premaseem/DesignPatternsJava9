package com.premaseem.inheritance.model;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class QE extends Employee{

    public QE (String name, Integer workHours, Integer rate) {
        super(name, rate, workHours,null,null);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", workHours=" + getWorkHours() +
                ", rate=" + getRate() +
                '}';
    }


}
