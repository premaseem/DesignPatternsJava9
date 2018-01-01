package com.premaseem.inheritance.model;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Hr extends Employee{

    public Hr (String name, Integer baseSalary, Integer bonusPercent) {
        super(name,null,null, baseSalary, bonusPercent);
    }

    @Override
    public String toString() {
        return "Hr{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }


}
