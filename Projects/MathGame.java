package Projects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MathGame extends JFrame {
    private JLabel numberLabel, timerLabel, scoreLabel;
    private JTextField answerField;
    private JButton submitButton;
    private int score = 0;
    private Random random = new Random();
    private int num1, num2;
    private Timer timer;
    private int timeLeft = 30; // 30 seconds per question

    public MathGame() {
        setTitle("Math Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 3));

        numberLabel = new JLabel();
        add(numberLabel);

        answerField = new JTextField();
        add(answerField);

        submitButton = new JButton("Submit");
        add(submitButton);

        timerLabel = new JLabel("Time left: " + timeLeft + " sec");
        add(timerLabel);

        scoreLabel = new JLabel("Score: " + score);
        add(scoreLabel);

        // Initialize the timer here
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                timerLabel.setText("Time left: " + timeLeft + " sec");
                if (timeLeft <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(MathGame.this, "Time's up! Moving to the next question.");
                    generateQuestion();
                }
            }
        });

        generateQuestion();

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
            }
        });

        setVisible(true);
    }

    private void generateQuestion() {
        num1 = random.nextInt(100); // Generate random numbers between 0 and 99
        num2 = random.nextInt(100);
        numberLabel.setText("    " + num1 + " + " + num2 + " = ");
        answerField.setText("");
        answerField.requestFocus();
        timeLeft = 30;
        timerLabel.setText("Time left: " + timeLeft + " sec");
        timer.start();
    }

    private void checkAnswer() {
        try {
            int userAnswer = Integer.parseInt(answerField.getText());
            int correctAnswer = num1 + num2;
            if (userAnswer == correctAnswer) {
                score++;
                scoreLabel.setText("Score: " + score);
                JOptionPane.showMessageDialog(this, "Correct!");
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect. Correct answer is " + correctAnswer);
            }
            generateQuestion();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MathGame();
            }
        });
    }
}
