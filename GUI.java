/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frame frame = new Frame();
        
        
        frame.setVisible(true);
        frame.setSize(400, 200);
        frame.setTitle("GUI");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setResizable(false);
        
        
        Label lab1 = new Label();
        Label lab2 = new Label();
        Label lab3 = new Label();
        TextField tf = new TextField();
        TextField tf1 = new TextField();
        Button btn = new Button("SUBMIT");
        
        Font font = new Font("Helvetica", Font.BOLD, 50); 

        lab3.setFont(font);       
        lab3.setText("LOG-IN FORM");
        
        tf.setPreferredSize(new Dimension(100, 20));
        lab1.setText("Username: ");
        
        lab2.setText("Password: ");
        tf1.setPreferredSize(new Dimension(100, 20));
        tf1.setEchoChar('$');

        
        frame.add(lab3);
        
        frame.add(lab1);
        frame.add(tf);
        frame.add(lab2);
        frame.add(tf1); 
        
        frame.add(btn);
        
        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
        System.exit(0);
        }

        });
        
        
        btn.addActionListener((ActionEvent e) -> {
            String name = tf.getText();
            String pass = tf1.getText();
            
            System.out.println("Your Username is: " + name);
            System.out.println("Your Password is: " + pass);
            
            tf.getText();
            tf1.getText();
        
       });
}
}
