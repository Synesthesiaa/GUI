/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;


import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class Mavenproject3{
    private static TextField textfield;
    private static String operand1 = "";
    private static String operator = "";
 
    public static void main(String[] args) {
        Frame frame = new Frame();
        
           
        Panel panel = new Panel();
        
        textfield = new TextField();
        Label label = new Label();
        
        
        // BUTTON //
        Button addButton = new Button("+");
        addButton.addActionListener(e -> handleOperatorClick("+")); 
	Button subButton = new Button("-");
        subButton.addActionListener(e -> handleOperatorClick("-"));   
	Button mulButton = new Button("*");
        mulButton.addActionListener(e -> handleOperatorClick("*"));     
	Button divButton = new Button("/");
        divButton.addActionListener(e -> handleOperatorClick("/")); 
        
	Button equButton = new Button("=");
        equButton.addActionListener(e -> calculateResult());   
	Button clrButton = new Button("Clr");
        clrButton.addActionListener(e -> clear());
     
        Button functionButtons0 = new Button("0");
        functionButtons0.addActionListener(e -> appendNumber("0"));
        Button functionButtons1 = new Button("1");
        functionButtons1.addActionListener(e -> appendNumber("1"));
        Button functionButtons2 = new Button("2");
        functionButtons2.addActionListener(e -> appendNumber("2"));
        Button functionButtons3 = new Button("3");
        functionButtons3.addActionListener(e -> appendNumber("3"));
        Button functionButtons4 = new Button("4");
        functionButtons4.addActionListener(e -> appendNumber("4"));
        Button functionButtons5 = new Button("5");
        functionButtons5.addActionListener(e -> appendNumber("5"));
        Button functionButtons6 = new Button("6");
        functionButtons6.addActionListener(e -> appendNumber("6"));
        Button functionButtons7 = new Button("7");
        functionButtons7.addActionListener(e -> appendNumber("7"));
        Button functionButtons8 = new Button("8");
        functionButtons8.addActionListener(e -> appendNumber("8"));
        Button functionButtons9 = new Button("9");
        functionButtons9.addActionListener(e -> appendNumber("9"));
        
        Font font = new Font("Helvetica", Font.BOLD, 10);
  
        panel.setPreferredSize(new Dimension(300, 250));
	panel.setLayout(new GridLayout(4,4,10,10));
        
         
        textfield.setPreferredSize(new Dimension(300, 50));
	textfield.setEditable(false);
        textfield.setBackground(Color.lightGray);
        textfield.setForeground(Color.BLACK);
        
 
        label.setText("GROUP 8 - CALCULATOR");
        label.setBounds(0, 0, 300, 50);
        label.setFont(font);
        label.setForeground(Color.lightGray);
        label.setBackground(Color.BLACK);
          
        
        panel.add(functionButtons1);
	panel.add(functionButtons2);
	panel.add(functionButtons3);
	panel.add(addButton);
	panel.add(functionButtons4);
	panel.add(functionButtons5);
	panel.add(functionButtons6);
	panel.add(subButton);
	panel.add(functionButtons7);
	panel.add(functionButtons8);
	panel.add(functionButtons9);
	panel.add(mulButton);
	panel.add(clrButton);
	panel.add(functionButtons0);
	panel.add(equButton);
	panel.add(divButton);
        panel.setBackground(Color.BLACK);
        
        frame.add(textfield);
	frame.add(panel);
        frame.add(label);
      
        
	frame.setVisible(true);
        frame.setSize(360, 400);
	frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
        frame.setTitle("CALCULATOR");
        
        //Function//
        
        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }

        });
        
        
       
        changeButtonBackground(panel, Color.darkGray);
        changeButtonFontColor(panel, Color.WHITE);
    
    }

        private static void changeButtonBackground(Container container, Color color) {
             Component[] components = container.getComponents();
                 for (Component component : components) {
                  if (component instanceof Button button) {
                     button.setBackground(color);
            }
        }
    }
    
         private static void changeButtonFontColor(Container container, Color color) {
            Component[] components = container.getComponents();
                for (Component component : components) {
                 if (component instanceof Button button) {
                     button.setForeground(color);
            }
        }
    }

        private static void appendNumber(String number) {
            textfield.setText(textfield.getText() + number);
    }
    
        private static void handleOperatorClick(String op) {
            operand1 = textfield.getText();
            operator = op;
            textfield.setText("");
    }
    
        private static void calculateResult() {
            if (!operand1.isEmpty() && !textfield.getText().isEmpty() && !operator.isEmpty()) {
              double num1 = Double.parseDouble(operand1);
              double num2 = Double.parseDouble(textfield.getText());
              double result = 0.0;
              switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textfield.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }
             textfield.setText(String.valueOf(result));
        }
    }
    
        private static void clear() {
            textfield.setText("");
            operand1 = "";
            operator = "";
    }
}
