import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //configure the maven in your project and add MongoDB Dependency
    // create html booking java application withMongoDB
    //1. create the client for establish the connection
    //2.create database and collection HotelBookingDB BokingCollection
    //3. create booking document and insert document into collection
    //4. update booking document(no of rooms,no of adults, hotel name, chekindate, cheakoutdate, room prefference, meal)
    //5.access all bookings documents
    //6.Delete the booking document
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        //to see how intelliJ IDEA support fixing it
        //create the mongoDB client for connection

        var client= MongoClients.create("mongodb://localhost:27017/");
        // create or get the database with name hotelbookingDB
        var hotelDB =client.getDatabase("HotelBookingDB");
         // create document and add hotel booking details

        Random random = new Random();
       // ArrayList<Document> bookinglist  = new ArrayList<>();
       var bookingCollection = hotelDB.getCollection("bookingCollection");

        /*var bookingdocument =  new Document();
        bookingdocument.append("bookingID",  random.nextInt(99999));
        bookingdocument.append(" hotel Name", "Taj Hotel");
        bookingdocument.append("userName", "Zubair ahmad");
        bookingdocument.append("userEmail", "abc@gmail.com");
        bookingdocument.append("user Mobile", "1234567890");
        bookingdocument.append("cheakINdate", "12-23-24");
        bookingdocument.append("cheakOUTdate", " 23-1");
        bookingdocument.append("noOfdays", 1);
        bookingdocument.append("Price", 1200);
        bookingdocument.append("NoOFRooms", 1);
        bookingdocument.append("RoomPrefferences", "River Face");
        bookingdocument.append("noOFAdults", 2);
        bookingdocument.append("Meal", true);
        bookinglist.add(bookingdocument);


        var bookingdocument1 =  new Document();
        bookinglist.add(bookingdocument);
        bookingdocument1.append("bookingID",  random.nextInt(99999));
        bookingdocument1.append(" hotel Name", "Taj Hotel");
        bookingdocument1.append("userName", "Ankit Tiwari");
        bookingdocument1.append("userEmail", "abc@gmail.com");
        bookingdocument1.append("user Mobile", "1234567890");
        bookingdocument1.append("cheakINdate", "12-23-24");
        bookingdocument1.append("cheakOUTdate", " 23-1");
        bookingdocument1.append("noOfdays", 1);
        bookingdocument1.append("Price", 1200);
        bookingdocument1.append("NoOFRooms", 1);
        bookingdocument1.append("RoomPrefferences", "River Face");
        bookingdocument1.append("noOFAdults", 2);
        bookingdocument1.append("Meal", true);
        bookinglist.add(bookingdocument1);


        var bookingdocument2 =  new Document();
        bookingdocument2.append("bookingID",  random.nextInt(99999));
        bookingdocument2.append(" hotel Name", "Taj Hotel");
        bookingdocument2.append("userName", "Madhur Gupta");
        bookingdocument2.append("userEmail", "abc@gmail.com");
        bookingdocument2.append("user Mobile", "1234567890");
        bookingdocument2.append("cheakINdate", "12-23-24");
        bookingdocument2.append("cheakOUTdate", " 23-1");
        bookingdocument2.append("noOfdays", 1);
        bookingdocument2.append("Price", 1200);
        bookingdocument2.append("NoOFRooms", 1);
        bookingdocument2.append("RoomPrefferences", "River Face");
        bookingdocument2.append("noOFAdults", 2);
        bookingdocument2.append("Meal", true);
        bookinglist.add(bookingdocument2);


        bookingCollection.insertMany(bookinglist);
        System.out.println("user data added");*/

        Document document = new Document();
        document.append("noOFadults",1);
        document.append("RoomPrefferences", "deluxe");
        bookingCollection.updateOne(new Document("userNmae", "Zubair ahmad"),   new Document("$set",new Document("noOFAdults",1)));



        bookingCollection.deleteOne(new Document("bookingID", 20435));
    }
}
