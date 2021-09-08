/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rafaeld
 */
public class PainelTexto extends JPanel{
    
    private JTextField txtNumero;
    
    public PainelTexto(){
        setLayout(new FlowLayout());
        txtNumero = new JTextField(15);
        txtNumero.setHorizontalAlignment(JTextField.RIGHT);
        txtNumero.setEditable(false);
        add(txtNumero);
    }
    
    public JTextField getTxtNumero(){
        return txtNumero;
    }
    
}
