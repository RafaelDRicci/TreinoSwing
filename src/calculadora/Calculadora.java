/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author rafaeld
 */
public class Calculadora extends JFrame{
    
    private PainelTexto painelText;
    
    public Calculadora() throws Exception{
        super("Calculadora");
        
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 350);
        setLocation(400,200);
        setResizable(false);
        
        setLayout(new BorderLayout());
        painelText = new PainelTexto();
        add(BorderLayout.NORTH, painelText);
        
        JPanel painelDigitos = new JPanel();
        painelDigitos.setLayout(new BorderLayout());
        add(BorderLayout.CENTER, painelDigitos);
        
        painelDigitos.add(BorderLayout.CENTER, new PainelNumeros(painelText.getTxtNumero()));
        painelDigitos.add(BorderLayout.EAST, new PainelOperacoes(painelText.getTxtNumero()));
        setVisible(true);
    }
    
    public static void main(String[] args) throws Exception{
        new Calculadora();
    }
    
}
