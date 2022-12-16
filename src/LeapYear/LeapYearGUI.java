package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame implements ActionListener{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
    btnCheckYear.addActionListener(e -> check_year());
    }


    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(200, 300);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void check_year() {
        try {
            int year = Integer.parseInt(tfYear.getText());
            if (year <= 0) {
                throw (new YearOnlyException());
            }
            if (year % 4 == 0) {
                JOptionPane.showMessageDialog(panel1, "Leap Year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Input Invalid");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(panel1, "Check Your Computer");
        } catch (YearOnlyException e) {
            JOptionPane.showMessageDialog(panel1, "Years only");
        }
    }

    static class YearOnlyException extends Exception {
        public YearOnlyException() {
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        check_year();
    }
}
