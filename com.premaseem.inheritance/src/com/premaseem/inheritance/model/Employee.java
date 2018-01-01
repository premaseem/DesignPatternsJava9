package com.premaseem.inheritance.model;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/
public class Employee {

    protected String name;
    protected Integer workHours;
    protected Integer rate;
    private Float salary;
    protected Integer baseSalary;
    protected Integer bonusPercent;

    public Employee (String name, Integer rate, Integer workHours,Integer baseSalary,Integer bonusPercent) {
        this.name = name;
        this.rate = rate;
        this.workHours = workHours;
        this.baseSalary = baseSalary;
        this.bonusPercent = bonusPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Float getSalary() {
        if (this.getClass().getName().equalsIgnoreCase("com.premaseem.inheritance.model.Hr") ){
            salary = (float) baseSalary + bonusPercent;
        }else{
            salary = (float) workHours * rate;
        }
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
