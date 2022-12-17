package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfNumber1;
    private JTextField tfResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result();
            }
        });

        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            calculate();
            }
        });
    }

    public void result() {
        calculate();
    }

    public void calculate() {
        try {
            double num_1 = Double.parseDouble(tfNumber1.getText());
            double num_2 = Double.parseDouble(tfNumber2.getText());

            if (cbOperations.getSelectedItem().equals("+")) {
                double Result = num_1 + num_2;
                tfResult.setText(String.valueOf((int) Result));
            } else if (cbOperations.getSelectedItem().equals("-")) {
                double Result = num_1 - num_2;
                tfResult.setText(String.valueOf((int) Result));
            } else if (cbOperations.getSelectedItem().equals("*")) {
                double Result = num_1 * num_2;
                tfResult.setText(String.valueOf((int) Result));
            } else if (cbOperations.getSelectedItem().equals("/")) {
                if (num_2 == 0) {
                    throw (new ArithmeticException());
                }
                double Result = num_1 / num_2;
                tfResult.setText(String.valueOf((int) Result));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Invalid Input");
        } catch (ArithmeticException e) {
            tfResult.setText("");
            JOptionPane.showMessageDialog(panel1, "Number can't divide with 0");
        }
    }
    public static void main(String[] args) {
        SimpleCalcGUI cal = new SimpleCalcGUI();
        cal.setTitle("Simple Calculator");
        cal.setContentPane(cal.panel1);
        cal.setSize(700, 300);
        cal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cal.setVisible(true);
    }
}
