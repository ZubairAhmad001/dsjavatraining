/*import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mysql.cj.xdevapi.Client;
import org.bson.Document;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     // to establish the mongodb collection with java  database
      /*  MongoClient client=MongoClients.create("mongodb://localhost:27017/");
        //create new database with new name
        MongoDatabase database = client.getDatabase("Zubairdb");
        // to access the list of collectios free database
        for (String name: database.listCollectionNames())
        {
            System.out.println(name);
        }

        database.createCollection("friends");
        System.out.println("new collection is created");*/
    //-----------------------------------------------------------------------------------------------------------------------------------
        /*MongoClient client=MongoClients.create("mongodb://localhost:27017/");
        //create new database with new name
        MongoDatabase database = client.getDatabase("RailwayDB");
        //2nd method of upper line
        //var database = client.getDatabase("RailwayDB");
        // to access the list of collectios free database
        for (String name: database.listCollectionNames())
        {
            System.out.println(name);
        }

        database.createCollection("Station");
        System.out.println("new collection is created");
        */


        // to delete the collection from database
     //   MongoClient client=MongoClients.create("mongodb://localhost:27017/");
       // var database = client.getDatabase("RailwayDB");
    //    for (String name: database.listCollectionNames())
     //   {
   //         System.out.println(name);
       // }

        /*database.createCollection("Station");
        System.out.println("new collection is created");*/

      //  var usercollection = database.getCollection("users");
        //create new documents for user collection
       // var userDocument = new Document();
     //   userDocument.append("name", "Zubair Ahmad");
     //   userDocument.append("add", "Aminabd");
     //   userDocument.append("phone", "1325356587");
    //    userDocument.append("gender", "male");
     //   usercollection.insertOne(userDocument);
      //  System.out.println("user data added");

