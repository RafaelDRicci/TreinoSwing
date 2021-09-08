/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author rafaeld
 */
public class PainelOperacoes extends Panel implements ActionListener{
    
    private JTextField txtTexto;
    private JButton btnAdd;
    private JButton btnSub;
    private JButton btnMult;
    private JButton btnDiv;
    private JButton btnEqual;
    private JButton btnClear;
    
    public PainelOperacoes(JTextField txtTexto){
        this.txtTexto = txtTexto;
        setLayout(new GridLayout(3,2));
        
        btnAdd = new JButton("+");
        btnAdd.addActionListener(this);
        add(btnAdd);
        
        btnSub = new JButton("-");
        btnAdd.addActionListener(this);
        add(btnSub);
        
        btnMult = new JButton("*");
        btnAdd.addActionListener(this);
        add(btnMult);
        
        btnDiv = new JButton("/");
        btnAdd.addActionListener(this);
        add(btnDiv);
        
        btnEqual = new JButton("=");
        btnAdd.addActionListener(this);
        add(btnEqual);
        
        btnClear = new JButton("C");
        btnAdd.addActionListener(this);
        add(btnClear);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nome = ((JButton)ae.getSource()).getText();
        if(!(nome.equals("=") || nome.equals("C"))){
            txtTexto.setText(txtTexto.getText()+nome);
        } else if(nome.equals("=")){
            realizarOperacao();
        } else if(nome.equals("C")){
            txtTexto.setText("");
        }
    }

    private void realizarOperacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
