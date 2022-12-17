package FoodOrdering;

import javax.swing.*;
import java.awt.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        btnOrder.addActionListener(e -> totalAmount());
    }

    public void totalAmount() {
        try {
            double amount = 0.00;

            if (cPizza.isSelected()) {
                amount += 100;
            }
            if (cBurger.isSelected()) {
                amount += 80.00;
            }
            if (cFries.isSelected()) {
                amount += 65.00;
            }
            if (cSoftDrinks.isSelected()) {
                amount += 55.00;
            }
            if (cTea.isSelected()) {
                amount += 50.00;
            }
            if (cSundae.isSelected()) {
                amount += 40.00;
            }

            if (rb5.isSelected()) {
                double discount = amount * 0.05;
                amount -= discount;
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", amount));
            }
            if (rb10.isSelected()) {
                double discount = amount * 0.10;
                amount -= discount;
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", amount));
            }
            if (rb15.isSelected()) {
                double discount = amount * 0.15;
                amount -= discount;
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", amount));
            }
            if (rbNone.isSelected()) {
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", amount));
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(panel1, "Check Your Computer");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel1, "Check Your Computer");
        }
    }

    public static void main(String[] args) {
        FoodOrderGUI OrderBot = new FoodOrderGUI();
        OrderBot.setTitle("Food Ordering System");
        OrderBot.setContentPane(OrderBot.panel1);
        OrderBot.setSize(700, 700);
        OrderBot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        OrderBot.setVisible(true);
    }
}