package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
@copyright: 2018 Packt Publication
*/

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DBconnector {

    MongoDatabase mongoDatabase = null;
    MongoDatabase designPatternsdb = null;

    public DBconnector(){
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        MongoDatabase designPatternsdb = mongoClient.getDatabase("designPatterns");
    }

    public MongoCollection<Document> getTable(String tableName){
        return designPatternsdb.getCollection(tableName);
    }


    public MongoDatabase getMongoDatabase () {
        return mongoDatabase;
    }

    public void setMongoDatabase (MongoDatabase mongoDatabase) {
        this.mongoDatabase = mongoDatabase;
    }

    public MongoDatabase getDesignPatternsdb () {
        return designPatternsdb;
    }

    public void setDesignPatternsdb (MongoDatabase designPatternsdb) {
        this.designPatternsdb = designPatternsdb;
    }
}
