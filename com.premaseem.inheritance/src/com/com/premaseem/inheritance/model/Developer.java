package com.com.premaseem.inheritance.model;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Developer {

    private String name;
    private Integer salary;
    private Integer workHours;
    private Integer rate;

    public Developer(String name, Integer workHours, Integer rate) {
        this.name = name;
        this.workHours = workHours;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + getSalary() +
                ", workHours=" + workHours +
                ", rate=" + rate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        salary = workHours * rate;
        return salary;
    }


    public Integer getWorkHours() {
        return workHours;
    }

    public void setWorkHours(Integer workHours) {
        this.workHours = workHours;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }
}
