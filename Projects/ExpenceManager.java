package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenceManager {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/expencedb";
        String user = "root";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("connected");

            // Design the Java UI for expense calculator
            JFrame frame = new JFrame("Zubair's Expense");

            JLabel titleLabel = new JLabel("EXPENSES");
            titleLabel.setBounds(225, 20, 100, 50);
            titleLabel.setForeground(Color.RED);
            frame.add(titleLabel);

            JLabel expenceTypeLabel = new JLabel("Expense Type: ");
            expenceTypeLabel.setBounds(40, 60, 150, 50);
            expenceTypeLabel.setForeground(Color.BLACK);
            frame.add(expenceTypeLabel);

            JTextField expencetypefield = new JTextField();
            expencetypefield.setBounds(200, 70, 130, 30);
            expencetypefield.setForeground(Color.BLACK);
            frame.add(expencetypefield);

            JLabel expenceAmountLabel = new JLabel("Enter Expense Amount: ");
            expenceAmountLabel.setBounds(40, 110, 150, 50);
            expenceAmountLabel.setForeground(Color.BLACK);
            frame.add(expenceAmountLabel);

            JTextField expenceamountfield = new JTextField();
            expenceamountfield.setBounds(200, 120, 130, 30);
            expenceamountfield.setForeground(Color.BLACK);
            frame.add(expenceamountfield);

            JLabel incomeAmountLabel = new JLabel("Enter Income Amount: ");
            incomeAmountLabel.setBounds(40, 160, 150, 30);
            incomeAmountLabel.setForeground(Color.BLACK);
            frame.add(incomeAmountLabel);

            JTextField incomeamountfield = new JTextField();
            incomeamountfield.setBounds(200, 160, 130, 30);
            incomeamountfield.setForeground(Color.BLACK);
            frame.add(incomeamountfield);

            JButton saveButton = new JButton("Save");
            saveButton.setBounds(160, 230, 130, 30);
            saveButton.setForeground(Color.white);
            saveButton.setBackground(Color.GRAY);

            // Adding ActionListener to saveButton
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        // Retrieve values from text fields
                        String expenseType = expencetypefield.getText();
                        int expenseAmount = Integer.parseInt(expenceamountfield.getText());
                        int incomeAmount = Integer.parseInt(incomeamountfield.getText());

                        // Insert data into the database
                        String insertQuery = "INSERT INTO expencetb(expencetype, expenceamount, incomeamount) VALUES (?, ?, ?)";
                        PreparedStatement ps = connection.prepareStatement(insertQuery);
                        ps.setString(1, expenseType);
                        ps.setInt(2, expenseAmount);
                        ps.setInt(3, incomeAmount);

                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(frame, "Expense data saved successfully.");

                        // Clear text fields after saving
                        expencetypefield.setText("");
                        expenceamountfield.setText("");
                        incomeamountfield.setText("");

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(frame, "Error saving expense data: " + ex.getMessage());
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for amounts.");
                    }
                }
            });

            frame.add(saveButton);

            frame.setSize(500, 400);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

