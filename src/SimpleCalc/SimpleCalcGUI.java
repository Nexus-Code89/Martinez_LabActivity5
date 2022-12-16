package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfNumber1;

    public static void main(String[] args) {
        SimpleCalcGUI cal = new SimpleCalcGUI;
        cal.setTitle("Simple Calculator");
        cal.setContentPane(cal.panel1);
        cal.setSize(200, 300);
        cal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cal.setVisible(true);
    }
}
