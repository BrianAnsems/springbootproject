import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@RestController
@EnableAutoConfiguration
public class Calculator extends JPanel {



    private JTextField firstNum;
    private JTextField secNum;
    private JButton addButt;
    private JLabel total;
    
    public Calculator(){
        
        this.setPreferredSize(new Dimension(300,30));
        this.setLayout(new FlowLayout());
        
        class MyActionListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                double a;
                double b;
                try{
                a = Double.parseDouble(firstNum.getText());}
                catch(NumberFormatException nfe){a=0;}
                try{
                b = Double.parseDouble(secNum.getText());}
                catch(NumberFormatException nfe){b=0;}
                
                double c;
                c=a+b;
                total.setText(""+c);
            }
        }
        firstNum = new JTextField(6);
        this.add(firstNum);
        
        secNum = new JTextField(6);
        this.add(secNum);
        
        addButt = new JButton("Add");
        this.add(addButt);
        addButt.addActionListener(new MyActionListener());
        
        
        
        total = new JLabel();
        this.add(total);
    }
    
    public static void main(String[] args){
        JFrame f = new JFrame("Adder");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.add(new Calculator());
        f.pack();
        f.setVisible(true);
    
    }
//public static void main(String[] args) throws Exception {
        //SpringApplication.run(Calculator.class, args);
    //}
}
    



