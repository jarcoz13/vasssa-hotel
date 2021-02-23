/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class ControlGui extends JFrame implements ActionListener{
    private final int VCAncho = 1000, VCAlto = 800;
    private JLabel LControl1;
    private ImageIcon IControl1;
    private JPanel PControl1;
    public ControlGui(){
       this.setLayout(null);
       this.setTitle("Hotelnow");
       this.setSize(VCAncho,VCAlto);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       crearComponentes();
       
    }
    public void crearComponentes(){
        crearIcon();
        crearLabel();
    }
    public void Acciones(){
        
    }
    public void crearPanel(){
        
    }
    public void crearIcon(){
        IControl1= new ImageIcon(getClass().getResource("/resource/Color1.png"));
    }
    public void crearLabel(){
        LControl1 = new JLabel();
        LControl1.setLayout(null);
        LControl1.setBounds(0, 0, VCAncho, VCAlto);
        LControl1.setIcon(new ImageIcon(IControl1.getImage().getScaledInstance(LControl1.getWidth(), LControl1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        this.getContentPane().add(LControl1);}
    public void crearBotones(){
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
