/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class LoginComponent implements ActionListener {

    private LoginTemplate loginTemplate;

    public LoginComponent() {
        loginTemplate = new LoginTemplate(this);
    }

    public LoginTemplate getLoginTemplate() {
        return loginTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginTemplate.getbEntrar())) {
            loginTemplate.dispose();
            entrar();
            
        }
        if (e.getSource().equals(loginTemplate.getbCerrar())) {
            System.exit(0);
        }
    }

    public void entrar() {
        ControlGui cg = new ControlGui();
        
        cg.setVisible(true);
    }
}
