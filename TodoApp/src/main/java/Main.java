import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      var client = MongoClients.create();
      var todoDB = client.getDatabase("ToDo");
      todoDB.createCollection("todoList");
      var todoCollection = todoDB.getCollection("todoList");
      var todoDocument = new Document();
      todoDocument.append("taskName", "Work on MomgoDB");
        todoDocument.append("todoDate", "13 Aug 2024");
        todoDocument.append("todoTime", "20 hrs");
        todoDocument.append("taskStatus", "false");
        todoCollection.insertOne(todoDocument);


        // to update document update
      // to change the date if status is false in all document
        todoCollection.updateOne(new Document("taskName", "Work on MongoDB") , new Document("$set", new Document("taskStatus", false)));
      //todoCollection.updateOne(new Document("taskStatus", "17 Aug 2024"), new Document("$set"), new  Document("Update") );

       //to fetch the document from collection
      FindIterable<Document> todoList = todoCollection.find();

      for (Document document: todoList){
        System.out.println("Task Name" + document.getString("taskName") + document.getString("taskName"));
      }

        }
    }

