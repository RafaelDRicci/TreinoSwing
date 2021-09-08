/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingteste;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author rafaeld
 */
public class Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        frame.add(BorderLayout.NORTH, new JButton("Norte"));
        frame.add(BorderLayout.SOUTH, new JButton("SUL"));
        frame.add(BorderLayout.EAST, new JButton("Leste"));
        frame.add(BorderLayout.WEST, new JButton("Oeste"));
        frame.add(BorderLayout.CENTER, new JButton("Centro"));
        
        
        
        JFrame frame2 = new JFrame();
        frame2.setSize(600,400);
        frame2.setLocation(100,100);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2.setLayout(new FlowLayout());
        frame2.setVisible(true);
        
        frame2.add(new JButton("Botão 1"));
        frame2.add(new JButton("Botão 2"));
        frame2.add(new JButton("Botão 3"));
        frame2.add(new JButton("Botão 4"));
        frame2.add(new JButton("Botão 5"));
        
        
        
        JFrame frame3 = new JFrame();
        frame3.setSize(600,400);
        frame3.setLocation(100,100);
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame3.setLayout(new GridLayout(2,4));
        frame3.setVisible(true);
        
        frame3.add(new JButton("Botão 1"));
        frame3.add(new JButton("Botão 2"));
        frame3.add(new JButton("Botão 3"));
        frame3.add(new JButton("Botão 4"));
        frame3.add(new JButton("Botão 5"));
        frame3.add(new JButton("Botão 6"));
        frame3.add(new JButton("Botão 7"));
        frame3.add(new JButton("Botão 8"));
        
    }
}
