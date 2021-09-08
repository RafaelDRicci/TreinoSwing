/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingteste;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author rafaeld
 */
public class SwingTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new JFrame();
        janela.setSize(600,300);
        janela.setLocation(100, 100);
        janela.setTitle("Nova Janela");
        
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        JLabel texto = new JLabel();
        texto.setText("Um Texto");
        
        JTextField campoTexto = new JTextField();
        campoTexto.setText("Dois Texto");
        campoTexto.setColumns(20);
        
        JTextArea areaTexto = new JTextArea();
        areaTexto.setText("Três Texto\nPulou uma Linha");
        areaTexto.setColumns(20);
        areaTexto.setRows(10);
        
        JComboBox box = new JComboBox();
        box.addItem("Item 1");
        box.addItem("Item 2");
        box.addItem("Item 3");
        
        JRadioButton radio = new JRadioButton();
        radio.setText("Item 1");
        
        JCheckBox check = new JCheckBox();
        radio.setText("Item 1");
        
        JButton button = new JButton();
        button.setText("Botão");
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        label.setText("Texto");
        panel.add(label);
        
        //janela.add(texto);
        //janela.add(campoTexto);
        ///janela.add(areaTexto);
        //janela.add(box);
        //janela.add(radio);
        //janela.add(check);
        //janela.add(button);
        //janela.add(panel);
        
    }


    
}
