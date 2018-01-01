/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

package com.premaseem;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Date;

public class Employee {

    public Employee(){
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.listEmployees();
        employee.countEmployees();
        employee.addEmployees();
        employee.listEmployees();
        employee.countEmployees();
    }

    private void listEmployees() {
        MongoCollection<Document> employees = DBconnector.getDBconnection();
        FindIterable<Document> documents = employees.find();
        for(Document doc : documents){
            System.out.println(doc);
        }
    }

    private static void countEmployees() {
        MongoCollection<Document> employees = DBconnector.getDBconnection();long count = employees.count();
        System.out.println("total number of employees = " + count);
    }

    private static void addEmployees(){
        Document emp1 = new Document();
        emp1.put("name","Aseem Jain");
        emp1.put("role","Developer");
        emp1.put("createdDate", new Date());

        Document emp2 = new Document();
        emp1.put("name","Meera Jain");
        emp1.put("role","Manager");
        emp1.put("createdDate", new Date());

        Document emp3 = new Document();
        emp1.put("name","Sony Jain");
        emp1.put("role","QE");
        emp1.put("createdDate", new Date());

        MongoCollection<Document> employees = DBconnector.getDBconnection();
        employees.insertOne(emp1);
        employees.insertOne(emp2);
        employees.insertOne(emp3);
    }
}
