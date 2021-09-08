/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author rafaeld
 */
public class Formulario {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        JFrame f = new JFrame();
        f.setTitle("Janela");
        f.setSize(300, 200);
        f.setLocation(500,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel p = new JPanel();
        
        JLabel l = new JLabel("Digite seu nome");
        p.add(l);
        
        JTextField t = new JTextField(10);
        p.add(t);
        
        JButton b = new JButton("OK");
        p.add(b);
        BotaoAction action = new BotaoAction(t);
        b.addActionListener(action);
        
        
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        
        f.add(p);
        f.setVisible(true);
    }
}
