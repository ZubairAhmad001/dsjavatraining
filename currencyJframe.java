package dsjavatraining;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyJframe extends JFrame implements ActionListener {
    private JTextField inputField;
    private JLabel outputLabel;
    private JButton inrToUsdButton, usdToInrButton;

    // Fixed exchange rate for demonstration purposes
    private final double INR_PER_USD = 82.0; // Replace with actual exchange rate

    public currencyJframe() {
        setTitle("INR-USD Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        inputField = new JTextField(10);
        outputLabel = new JLabel("Result:");
        inrToUsdButton = new JButton("INR to USD");
        usdToInrButton = new JButton("USD to INR");

        inrToUsdButton.addActionListener(this);
        usdToInrButton.addActionListener(this);

        add(inputField);
        add(inrToUsdButton);
        add(usdToInrButton);
        add(outputLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double inputAmount = Double.parseDouble(inputField.getText());
        double result = 0.0;

        if (e.getSource() == inrToUsdButton) {
            result = inputAmount / INR_PER_USD;
            outputLabel.setText("USD: " + String.format("%.2f", result));
        } else if (e.getSource() == usdToInrButton) {
            result = inputAmount * INR_PER_USD;
            outputLabel.setText("INR: " + String.format("%.2f", result));
        }
    }

    public static void main(String[] args) {
        new currencyJframe();
    }
}

