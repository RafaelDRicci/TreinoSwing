/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingteste;

import javax.swing.JFrame;
import javax.swing.JMenu;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author rafaeld
 */
public class Menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,100);
        frame.setLocation(100,100);
        frame.setVisible(true);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu m1 = new JMenu("Arquivo");
        m1.setMnemonic('A');
        
        JMenuItem mil = new JMenuItem("Sair");
        mil.setMnemonic('S');
        m1.add(mil);
        
        JMenu m2 = new JMenu("Editar");
        m2.setMnemonic('E');
        
        mb.add(m1);
        mb.add(m2);
        frame.setJMenuBar(mb);
        
        
    }
}
