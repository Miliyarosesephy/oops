import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    // Frame and components
    private JFrame frame;
    private JTextField displayField;

    public SimpleCalculator() {
        // Initialize the frame and the text field for the display
        frame = new JFrame("Simple Calculator");
        displayField = new JTextField(20);

        // Set up the frame layout
        frame.setLayout(new FlowLayout());

        // Set the text field properties
        displayField.setEditable(true);
        displayField.setHorizontalAlignment(JTextField.RIGHT);

        // Add the text field to the frame
        frame.add(displayField);

        // Add a listener to handle when the user presses Enter
        displayField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the expression from the text field and evaluate it
                    String expression = displayField.getText();
                    double result = evaluateExpression(expression);
                    displayField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    displayField.setText("Error");
                }
            }
        });

        // Set the frame properties
        frame.setSize(250, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    // Method to evaluate basic arithmetic expressions (only +, -, *, /)
    private double evaluateExpression(String expression) throws Exception {
        // Split the expression into tokens (assuming space-separated values for simplicity)
        String[] tokens = expression.split(" ");
        if (tokens.length < 3) {
            throw new Exception("Invalid expression");
        }

        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);

        // Perform the operation based on the operator
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new Exception("Cannot divide by zero");
                }
                return num1 / num2;
            default:
                throw new Exception("Unknown operator");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}


