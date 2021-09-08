/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author rafaeld
 */
public class BotaoAction implements ActionListener{

    private JTextField t;
    
    public BotaoAction(JTextField t) {
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = t.getText();
        JOptionPane.showMessageDialog(null, "Nome: "+nome);
    }
    
}
