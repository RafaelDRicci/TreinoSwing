/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janela;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

/**
 *
 * @author rafaeld
 */
public class SairAction extends AbstractAction{

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
}
