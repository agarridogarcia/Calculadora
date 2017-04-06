
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventanas {
   
    JFrame marco=new JFrame("***CALCULADORA***");
    JButton bot1=new JButton("1");
        JButton bot2=new JButton("2");
        JButton bot3=new JButton("3");
        JButton botMas=new JButton("+");
        JButton bot4=new JButton("4");
        JButton bot5=new JButton("5");
        JButton bot6=new JButton("6");
        JButton botMenos=new JButton("-");
        JButton bot7=new JButton("7");
        JButton bot8=new JButton("8");
        JButton bot9=new JButton("8");
        JButton botMulti=new JButton("*");
        JButton botLimp=new JButton("Borrar");
        JButton botCero=new JButton("0");
        JButton botDiv=new JButton("/");
        JButton botIgual=new JButton("=");
       
        JPanel panel=new JPanel();
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        
        JTextField tx=new JTextField ("                0");
    public void crearVentana(){
        JFrame marco=new JFrame("***CALCULADORA***");
        marco.setSize(400,500);
         //marco.setVisible(true);
       
        panel.setLayout(new BorderLayout());
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
      

        marco.add(panel);
//         marco.add(panel1);
//        marco.add(panel2);
        panel.setVisible(true);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
        
        public void creaPanel1(){
             
            
             panel1.add(tx);
             panel1.setVisible(true);
           
           
         
        }   
        public void creaPanel2(){
        panel2.setLayout(new GridLayout(4,4));
        panel2.add(bot1);
        panel2.add(bot2);
        panel2.add(bot3);
        panel2.add(botMas);
        panel2.add(bot4);
        panel2.add(bot5);
        panel2.add(bot6);
        panel2.add(botMenos);
        panel2.add(bot7);
        panel2.add(bot8);
        panel2.add(bot9);
        panel2.add(botMulti);
        panel2.add(botLimp);
        panel2.add(botCero);
        panel2.add(botDiv);
        panel2.add(botIgual);
        panel2.setVisible(true);
            
        }
    
}      
