/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rafaeld
 */
public class PainelNumeros extends JPanel implements ActionListener{
    
    private JTextField txtText;
    
    public PainelNumeros(JTextField txtText){
        this.txtText = txtText;
        setLayout(new GridLayout(4, 4));
        
        JButton btn1 = new JButton();
        btn1.setText("1");
        btn1.addActionListener(this);
        add(btn1);
        
        JButton btn2 = new JButton();
        btn2.setText("2");
        btn2.addActionListener(this);
        add(btn2);
        
        JButton btn3 = new JButton();
        btn3.setText("3");
        btn3.addActionListener(this);
        add(btn3);
        
        JButton btn4 = new JButton();
        btn4.setText("4");
        btn4.addActionListener(this);
        add(btn4);
        
        JButton btn5 = new JButton();
        btn5.setText("5");
        btn5.addActionListener(this);
        add(btn5);
        
        JButton btn6 = new JButton();
        btn6.setText("6");
        btn6.addActionListener(this);
        add(btn6);
        
        JButton btn7 = new JButton();
        btn7.setText("7");
        btn7.addActionListener(this);
        add(btn7);
        
        JButton btn8 = new JButton();
        btn8.setText("8");
        btn8.addActionListener(this);
        add(btn8);
        
        JButton btn9 = new JButton();
        btn9.setText("9");
        btn9.addActionListener(this);
        add(btn9);
        
        JButton btnV1 = new JButton();
        btnV1.setEnabled(false);
        add(btnV1);
        
        JButton btn0 = new JButton();
        btn0.setText("0");
        btn0.addActionListener(this);
        add(btn0);
        
        JButton btnV2 = new JButton();
        btnV2.setEnabled(false);
        add(btnV2);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String numero = ((JButton)(ae.getSource())).getText();
        txtText.setText(txtText.getText()+numero);
    }
    
}
