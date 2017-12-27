package com.premaseem.main;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.bson.Document;


public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        MongoDatabase designPatternsdb = mongoClient.getDatabase("designPatterns");
        MongoCollection<Document> employees = designPatternsdb.getCollection("employees");
        FindIterable<Document> documents = employees.find();
        for(Document doc : documents){
            System.out.println(doc);
        }

    }
    Main m = new Main();


}
