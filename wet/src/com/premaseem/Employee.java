/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

package com.premaseem;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.bson.Document;

import java.util.Date;

public class Employee {

    public static void main(String[] args) {
        countEmployees();
        addEmployees();
        listEmployees();
        countEmployees();
    }

    private static void listEmployees() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27018"));
        MongoDatabase designPatternsdb = mongoClient.getDatabase("designPatterns");
        MongoCollection<Document> employees = designPatternsdb.getCollection("employees");
        FindIterable<Document> documents = employees.find();
        for(Document doc : documents){
            System.out.println(doc);
        }
    }

    private static void countEmployees() {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27018"));
        MongoDatabase designPatternsdb = mongoClient.getDatabase("designPatterns");
        MongoCollection<Document> employees = designPatternsdb.getCollection("employees");
        long count = employees.count();
        System.out.println("total number of employees = " + count);

    }

    private static void addEmployees(){
        Document emp1 = new Document();
        emp1.put("name","Aseem Jain");
        emp1.put("role","Developer");
        emp1.put("createdDate", new Date());

        Document emp2 = new Document();
        emp2.put("name","Meera Jain");
        emp2.put("role","Manager");
        emp2.put("createdDate", new Date());

        Document emp3 = new Document();
        emp3.put("name","Sony Jain");
        emp3.put("role","QE");
        emp3.put("createdDate", new Date());

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27018"));
        MongoDatabase designPatternsdb = mongoClient.getDatabase("designPatterns");
        MongoCollection<Document> employees = designPatternsdb.getCollection("employees");

        employees.insertOne(emp1);
        employees.insertOne(emp2);
        employees.insertOne(emp3);
    }
}
