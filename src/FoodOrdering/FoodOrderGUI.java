package FoodOrdering;

import javax.swing.*;

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

    public static void main(String[] args) {
        FoodOrderGUI OrderBot = new FoodOrderGUI();
        OrderBot.setTitle("Food Ordering System");
        OrderBot.setContentPane(OrderBot.panel1);
        OrderBot.setSize(700, 700);
        OrderBot.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        OrderBot.setVisible(true);
    }
}