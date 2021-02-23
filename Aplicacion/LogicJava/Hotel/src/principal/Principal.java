/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import gui.LoginComponent;
import javax.swing.SwingUtilities;

/**
 *
 * @author sebas & Alejo & Vi
 */
public class Principal {

    public static void main(String[] args) {
        Runnable runAplication = new Runnable() {
            @Override
            public void run() {
                LoginComponent login = new LoginComponent(); // declaracion de la clase
            }
        };
        SwingUtilities.invokeLater(runAplication);
    }

}
