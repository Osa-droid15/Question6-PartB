/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productcalculator;

/**
 *
 * @author odong
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProductCalculator {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Product Calculator");
        frame.setLayout(new java.awt.FlowLayout());

        // Create text fields for input
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        
        // Create a button
        JButton calculateButton = new JButton("Calculate Product");
        
        // Create a label to display result
        JLabel resultLabel = new JLabel("Result will be displayed here");

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get numbers from text fields
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());

                    // Calculate product
                    int product = num1 * num2;

                    // Display result
                    resultLabel.setText("Product: " + product);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input. Please enter integers.");
                }
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Enter number 1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Enter number 2:"));
        frame.add(num2Field);
        frame.add(calculateButton);
        frame.add(resultLabel);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

