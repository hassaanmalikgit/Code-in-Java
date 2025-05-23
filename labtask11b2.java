import javax.swing.*;
import java.awt.event.*;

  class SimpleCalculatorEasy {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Input fields
        JTextField num1 = new JTextField();
        num1.setBounds(50, 20, 200, 30);
        JTextField num2 = new JTextField();
        num2.setBounds(50, 60, 200, 30);

        // Result label
        JLabel result = new JLabel("Result: ");
        result.setBounds(50, 100, 200, 30);

        // Buttons
        JButton add = new JButton("+");
        add.setBounds(50, 140, 50, 30);
        JButton sub = new JButton("-");
        sub.setBounds(110, 140, 50, 30);
        JButton mul = new JButton("*");
        mul.setBounds(170, 140, 50, 30);
        JButton div = new JButton("/");
        div.setBounds(230, 140, 50, 30);


        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    double res = 0;

                    if (e.getSource() == add) res = n1 + n2;
                    if (e.getSource() == sub) res = n1 - n2;
                    if (e.getSource() == mul) res = n1 * n2;
                    if (e.getSource() == div) {
                        if (n2 == 0) {
                            JOptionPane.showMessageDialog(frame, "Can't divide by zero!");
                            return;
                        }
                        res = n1 / n2;
                    }

                    result.setText("Result: " + res);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
                }
            }
        };

        add.addActionListener(action);
        sub.addActionListener(action);
        mul.addActionListener(action);
        div.addActionListener(action);

        // Add to frame
        frame.add(num1);
        frame.add(num2);
        frame.add(result);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);

        frame.setVisible(true);
    }
}
