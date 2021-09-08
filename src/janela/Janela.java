/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author rafaeld
 */
public class Janela extends JFrame{
    
    public Janela(){
        setTitle("Minha Aplicação");
        setSize(600, 300);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBarra = new JMenuBar();
        
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        
        JMenuItem itemNovo = new JMenuItem("Novo");
        itemNovo.setMnemonic('N');
        
        JMenuItem itemSair = new JMenuItem(new SairAction());
        itemSair.setText("Sair");
        itemSair.setMnemonic('S');
        
        menuArquivo.add(itemNovo);
        menuArquivo.add(itemSair);
        
        JMenu menuEditar = new JMenu("Editar");
        menuEditar.setMnemonic('E');
        JMenuItem itemCopiar = new JMenuItem("Copiar");
        itemCopiar.setMnemonic('C');
        menuEditar.add(itemCopiar);
        
        menuBarra.add(menuArquivo);
        menuBarra.add(menuEditar);
        
        setJMenuBar(menuBarra);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Janela();
    }
    
}
