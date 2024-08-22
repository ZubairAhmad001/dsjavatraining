
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class HotelBookingSystem extends JFrame {

    private JTextField firstNameField, lastNameField, address1Field, address2Field, cityField, postalCodeField, contactField, emailField;
    private JComboBox<String> stateBox, roomPrefBox, adultsBox, childrenBox;
    private JFormattedTextField checkinDateField, checkinTimeField, checkoutDateField, checkoutTimeField;
    private JButton submitButton, resetButton;

    public HotelBookingSystem() {
        // Frame settings
        setTitle("Hotel Booking System");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(17, 2));

        // Form elements
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        address1Field = new JTextField();
        address2Field = new JTextField();
        cityField = new JTextField();
        postalCodeField = new JTextField();
        contactField = new JTextField();
        emailField = new JTextField();

        String[] states = {"Select State", "Andhra Pradesh" , "Arunachal Pradesh", "Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
        stateBox = new JComboBox<>(states);

        String[] roomPrefs = {"Select Room", "Single", "Double", "Suite"};
        roomPrefBox = new JComboBox<>(roomPrefs);

        String[] adults = {"1", "2", "3", "4"};
        adultsBox = new JComboBox<>(adults);

        String[] children = {"0", "1", "2", "3"};
        childrenBox = new JComboBox<>(children);

        checkinDateField = new JFormattedTextField();
        checkinTimeField = new JFormattedTextField();
        checkoutDateField = new JFormattedTextField();
        checkoutTimeField = new JFormattedTextField();

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        // Add elements to the frame
        add(new JLabel("First Name:"));
        add(firstNameField);
        add(new JLabel("Last Name:"));
        add(lastNameField);
        add(new JLabel("Address 1:"));
        add(address1Field);
        add(new JLabel("Address 2:"));
        add(address2Field);
        add(new JLabel("State:"));
        add(stateBox);
        add(new JLabel("City:"));
        add(cityField);
        add(new JLabel("Postal Code:"));
        add(postalCodeField);
        add(new JLabel("Contact Number:"));
        add(contactField);
        add(new JLabel("Email Address:"));
        add(emailField);
        add(new JLabel("Room Preference:"));
        add(roomPrefBox);
        add(new JLabel("No of Adults:"));
        add(adultsBox);
        add(new JLabel("No of Children:"));
        add(childrenBox);
        add(new JLabel("Check-in Date:"));
        add(checkinDateField);
        add(new JLabel("Check-in Time:"));
        add(checkinTimeField);
        add(new JLabel("Check-out Date:"));
        add(checkoutDateField);
        add(new JLabel("Check-out Time:"));
        add(checkoutTimeField);

        add(submitButton);
        add(resetButton);

        // Button actions
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitData();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
            }
        });

        setVisible(true);
    }

    private void submitData() {
        try (MongoClient mongoClient = new MongoClient("localhost", 27017)) {
            MongoDatabase database = mongoClient.getDatabase("hotel_booking");
            MongoCollection<Document> collection = database.getCollection("bookings");

            Document booking = new Document("first_name", firstNameField.getText())
                    .append("last_name", lastNameField.getText())
                    .append("address1", address1Field.getText())
                    .append("address2", address2Field.getText())
                    .append("state", stateBox.getSelectedItem().toString())
                    .append("city", cityField.getText())
                    .append("postal_code", postalCodeField.getText())
                    .append("contact_number", contactField.getText())
                    .append("email", emailField.getText())
                    .append("room_preference", roomPrefBox.getSelectedItem().toString())
                    .append("no_of_adults", adultsBox.getSelectedItem().toString())
                    .append("no_of_children", childrenBox.getSelectedItem().toString())
                    .append("checkin_date", checkinDateField.getText())
                    .append("checkin_time", checkinTimeField.getText())
                    .append("checkout_date", checkoutDateField.getText())
                    .append("checkout_time", checkoutTimeField.getText());

            collection.insertOne(booking);
            JOptionPane.showMessageDialog(this, "Booking Successful!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }

    private void resetForm() {
        firstNameField.setText("");
        lastNameField.setText("");
        address1Field.setText("");
        address2Field.setText("");
        cityField.setText("");
        postalCodeField.setText("");
        contactField.setText("");
        emailField.setText("");
        stateBox.setSelectedIndex(0);
        roomPrefBox.setSelectedIndex(0);
        adultsBox.setSelectedIndex(0);
        childrenBox.setSelectedIndex(0);
        checkinDateField.setText("");
        checkinTimeField.setText("");
        checkoutDateField.setText("");
        checkoutTimeField.setText("");
    }

    public static void main(String[] args) {
        new HotelBookingSystem();
        var client= MongoClients.create("mongodb://localhost:27017/");
        var hotelDB =client.getDatabase("HotelBookingDB");
        var bookingCollection = hotelDB.getCollection("bookingCollection");
    }
}
