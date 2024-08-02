package Projects;

import javax.swing.*;

public class BMIjavaProgramSwing {
    public static void main(String[] args) {
        // Create a frame using Swing in Java
        JFrame frame = new JFrame("BMI Calculator");

        JLabel heightLabel = new JLabel("Enter your Height (m)");
        JLabel weightLabel = new JLabel("Enter your Weight (kg)");
        JLabel bmiLabel = new JLabel();

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();

        JButton bmiButton = new JButton("Calculate BMI");

        // Set the size and position of UI components
        heightLabel.setBounds(20, 25, 200, 40);
        heightField.setBounds(200, 30, 50, 30);
        weightLabel.setBounds(20, 70, 200, 40);
        weightField.setBounds(200, 75, 50, 30);
        bmiButton.setBounds(80, 120, 120, 40);
        bmiLabel.setBounds(50, 160, 200, 40);

        // Attach components to the frame
        frame.add(heightLabel);
        frame.add(heightField);
        frame.add(weightLabel);
        frame.add(weightField);
        frame.add(bmiButton);
        frame.add(bmiLabel);

        // Define action for bmiButton
        bmiButton.addActionListener(e -> {
            try {
                // Retrieve height and weight from text fields
                double height = Double.parseDouble(heightField.getText());
                double weight = Double.parseDouble(weightField.getText());

                // Calculate BMI
                double bmi = weight / (height * height);

                // Display BMI
                bmiLabel.setText("Your BMI: " + String.format("%.2f", bmi));

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for height and weight.");
            } catch (ArithmeticException ex) {
                JOptionPane.showMessageDialog(frame, "Error calculating BMI. Check input values.");
            }
        });

        // Set the layout to null for absolute positioning
        frame.setLayout(null);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
