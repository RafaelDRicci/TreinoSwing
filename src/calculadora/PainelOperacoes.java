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
        btnSub.addActionListener(this);
        add(btnSub);
        
        btnMult = new JButton("*");
        btnMult.addActionListener(this);
        add(btnMult);
        
        btnDiv = new JButton("/");
        btnDiv.addActionListener(this);
        add(btnDiv);
        
        btnEqual = new JButton("=");
        btnEqual.addActionListener(this);
        add(btnEqual);
        
        btnClear = new JButton("C");
        btnClear.addActionListener(this);
        add(btnClear);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String operacao = ((JButton)ae.getSource()).getText();
        if(!(operacao.equals("=") || operacao.equals("C"))){
            txtTexto.setText(txtTexto.getText()+operacao);
        } else if(operacao.equals("=")){
            realizarOperacao();
        } else if(operacao.equals("C")){
            txtTexto.setText("");
        }
    }

    private void realizarOperacao() {
        char[] operacao = (txtTexto.getText()).toCharArray();
        float resultado = 0;
        float numero;
        String numeroString = "";
        char simbolo = 0;
        
        int i = 0;
        do{
            if(isOperador(operacao[i])){
                numero = Float.valueOf(numeroString);
                resultado = calcular(resultado, numero, simbolo);
                simbolo = operacao[i];
                numeroString = "";
            } else {
                numeroString += operacao[i];
            }
            i++;
            if((i == operacao.length)){
                numero = Float.valueOf(numeroString);
                resultado = calcular(resultado, numero, simbolo);
            }
        }while(i < operacao.length);
        txtTexto.setText(Float.toString(resultado));
    }
    
    private boolean isOperador(char character){
        return (character == '+' || character == '-' || character == '/' || character == '*');
    }
    
    private float calcular(float resultado, float numero, char operador){
        switch(operador){
            case '+':
                return resultado + numero;
            case '-':
                return resultado - numero;
            case '*':
                return resultado * numero;
            case '/':
                return resultado / numero;
            default :
                return numero;
        }
    }
    
}
