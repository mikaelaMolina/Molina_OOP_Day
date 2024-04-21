
package simplecalculator;

import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class CalculatorGUI {

    
    public static void main(String[] args) {
        
        
        
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField textFld = new JTextField();
    Border border = BorderFactory.createLineBorder(Color.white, 1);
    
    
    
    
    //buttons declaration
    JButton button = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("+");
    JButton button11 = new JButton("-");
    JButton button12 = new JButton("×");
    JButton button13 = new JButton("÷");
    JButton button14 = new JButton("=");
    JButton button15 = new JButton("C");
    

    
    //labels
    panel.setBounds(0,0,380,500);

    textFld.setBounds(7,5,350,90);

    
    //button setbounds for 1st row
    button7.setBounds(7,100,80,50);
    button8.setBounds(97,100,80,50);
    button9.setBounds(187,100,80,50);
    button13.setBounds(277,100,80,50);
    
    //button setbounds for 2nd row
    button4.setBounds(7,160,80,50);
    button5.setBounds(97,160,80,50);
    button6.setBounds(187,160,80,50);
    button12.setBounds(277,160,80,50);
    
    //button setbounds for 3rd row
    button1.setBounds(7,220,80,50);
    button2.setBounds(97,220,80,50);
    button3.setBounds(187,220,80,50);
    button11.setBounds(277,220,80,50);
    
    //button setbounds for 4th row
    button15.setBounds(7,280,80,50);
    button.setBounds(97,280,80,50);
    button14.setBounds(187,280,80,50);
    button10.setBounds(277,280,80,50);
    
    panel.setBackground(Color.BLACK);

    //frame 
    frame.setSize(380,380);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Simple Calculator");

    //buttons design 1st row
    frame.add(button7);
    button7.setBackground(Color.DARK_GRAY);
    button7.setFont(new Font("Serif", Font.BOLD, 20));
    button7.setForeground(Color.white);
    button7.setCursor(new Cursor(HAND_CURSOR)); 
    button7.setBorder(border);
    
    frame.add(button8);
    button8.setBackground(Color.DARK_GRAY);
    button8.setFont(new Font("Serif", Font.BOLD, 20));
    button8.setForeground(Color.white);
    button8.setCursor(new Cursor(HAND_CURSOR)); 
    button8.setBorder(border);
    
    frame.add(button9);
    button9.setBackground(Color.DARK_GRAY);
    button9.setFont(new Font("Serif", Font.BOLD, 20));
    button9.setForeground(Color.white);
    button9.setCursor(new Cursor(HAND_CURSOR));
    button9.setBorder(border);
    
    frame.add(button13);
    button13.setBackground(Color.DARK_GRAY);
    button13.setFont(new Font("Serif", Font.BOLD, 20));
    button13.setForeground(Color.white);
    button13.setCursor(new Cursor(HAND_CURSOR)); 
    button13.setBorder(border);
    
    
    //buttons design 2nd row
    frame.add(button4);
    button4.setBackground(Color.DARK_GRAY);
    button4.setFont(new Font("Serif", Font.BOLD, 20));
    button4.setForeground(Color.white);
    button4.setCursor(new Cursor(HAND_CURSOR)); 
    button4.setBorder(border);
    
    frame.add(button5);
    button5.setBackground(Color.DARK_GRAY);
    button5.setFont(new Font("Serif", Font.BOLD, 20));
    button5.setForeground(Color.white);
    button5.setCursor(new Cursor(HAND_CURSOR)); 
    button5.setBorder(border);
    
    frame.add(button6);
    button6.setBackground(Color.DARK_GRAY);
    button6.setFont(new Font("Serif", Font.BOLD, 20));
    button6.setForeground(Color.white);
    button6.setCursor(new Cursor(HAND_CURSOR)); 
    button6.setBorder(border);
    
    frame.add(button12);
    button12.setBackground(Color.DARK_GRAY);
    button12.setFont(new Font("Serif", Font.BOLD, 20));
    button12.setForeground(Color.white);
    button12.setCursor(new Cursor(HAND_CURSOR)); 
    button12.setBorder(border);
    
    //buttons design 3rd row
    frame.add(button1);
    button1.setBackground(Color.DARK_GRAY);
    button1.setFont(new Font("Serif", Font.BOLD, 20));
    button1.setForeground(Color.white);
    button1.setCursor(new Cursor(HAND_CURSOR)); 
    button1.setBorder(border);
    
    frame.add(button2);
    button2.setBackground(Color.DARK_GRAY);
    button2.setFont(new Font("Serif", Font.BOLD, 20));
    button2.setForeground(Color.white);
    button2.setCursor(new Cursor(HAND_CURSOR)); 
    button2.setBorder(border);
    
    frame.add(button3);
    button3.setBackground(Color.DARK_GRAY);
    button3.setFont(new Font("Serif", Font.BOLD, 20));
    button3.setForeground(Color.white);
    button3.setBorder(border);
    
    frame.add(button11);
    button11.setBackground(Color.DARK_GRAY);
    button11.setFont(new Font("Serif", Font.BOLD, 20));
    button11.setForeground(Color.white);
    button11.setCursor(new Cursor(HAND_CURSOR)); 
    button11.setBorder(border);
    
    //buttons design 4th row
    frame.add(button15);
    button15.setBackground(Color.RED);
    button15.setFont(new Font("Serif", Font.BOLD, 20));
    button15.setForeground(Color.white);
    button15.setCursor(new Cursor(HAND_CURSOR)); 
    button15.setBorder(border);
    
    frame.add(button);
    button.setBackground(Color.DARK_GRAY);
    button.setFont(new Font("Serif", Font.BOLD, 20));
    button.setForeground(Color.white);
    button.setCursor(new Cursor(HAND_CURSOR)); 
    button.setBorder(border);
    
    frame.add(button14);
    button14.setBackground(Color.RED);
    button14.setFont(new Font("Serif", Font.BOLD, 20));
    button14.setForeground(Color.white);
    button14.setCursor(new Cursor(HAND_CURSOR)); 
    button14.setBorder(border);
    
    frame.add(button10);
    button10.setBackground(Color.DARK_GRAY);
    button10.setFont(new Font("Serif", Font.BOLD, 20));
    button10.setForeground(Color.white);
    button10.setCursor(new Cursor(HAND_CURSOR)); 
    button10.setBorder(border);
    
    //panel
    frame.add(panel);
    //textfield
    
    double firstOperand = 0, secondOperand = 0;
    
    //Action Listener for numbers using lambda expression
    button.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "0");
    });
    button1.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "1");
    });
    button2.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "2");
    });
    button3.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "3");
    });
    button4.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "4");
    });
    button5.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "5");
    });
    button6.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "6");
    });
    button7.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "7");
    });
    button8.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "8");
    });
    button9.addActionListener((ActionEvent e) -> {
        textFld.setText(textFld.getText() + "9");
    });   

    Calculator calc = new Calculator();
    char operator = '+';

    button10.addActionListener((ActionEvent e) -> {
        calc.setNum1(Double.parseDouble(textFld.getText()));
        textFld.setText(textFld.getText() + "+");
        calc.setOperator('+');
        });
    button11.addActionListener((ActionEvent e) -> {
        calc.setNum1(Double.parseDouble(textFld.getText()));
        textFld.setText(textFld.getText() + "-");
        calc.setOperator('-');
    });
    button12.addActionListener((ActionEvent e) -> {
        calc.setNum1(Double.parseDouble(textFld.getText()));
        textFld.setText(textFld.getText() + "×");
        calc.setOperator('*');
    });
    button13.addActionListener((ActionEvent e) -> {
        calc.setNum1(Double.parseDouble(textFld.getText()));
        textFld.setText(textFld.getText() + "÷");
        calc.setOperator('/');
    });


button14.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String input = textFld.getText();
        String[] parts = input.split("\\+|-|\\*|/|×|÷");
        

        calc.setNum2(Double.parseDouble(parts[1]));

        try {
            double result = calc.calculate();
            textFld.setText(String.valueOf(result));
        } catch (ArithmeticException ae) {
            textFld.setText("Error: " + ae.getMessage());
        } catch (IllegalArgumentException ie) {
            textFld.setText("Error: " + ie.getMessage());
        }
    }
});

    button15.addActionListener((ActionEvent e) -> {
        textFld.setText("");
        calc.setNum1(0);
        calc.setNum2(0);
        
    });
    
    frame.add(textFld);
    textFld.setFont(new Font("Serif", Font.BOLD, 20));
    textFld.setBackground(Color.LIGHT_GRAY);
    textFld.setBorder(border);
    textFld.setEditable(false);



    }
    
    
}
