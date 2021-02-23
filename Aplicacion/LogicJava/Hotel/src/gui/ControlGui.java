/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class ControlGui extends JFrame implements ActionListener{
    private final int VCAncho = 1000, VCAlto = 800;
    private JLabel LControl1;
    private JLabel LControl2;
    private JLabel LContacto1;
    private JLabel LControl3;
    private JLabel Logo1;
    private JLabel Logo2;
    private ImageIcon IControl1;
    private ImageIcon IControl2;
    private ImageIcon IControl3;
    private ImageIcon FInicio;
    private ImageIcon IHome;
    private ImageIcon IContacto;
    private ImageIcon IServicios;
    private ImageIcon IReservas;
    private JPanel PControl2;
    private JPanel PControl3;
    private JPanel PContacto;
    private JPanel PServicios;
    private JPanel PReservas;
    private JPanel PContacto1;
    private JButton BHome;
    private JButton BContacto;
    private JButton BServicios;
    private JButton BReservas;
    private JPanel PHome;
    
    
    public ControlGui(){
       this.setLayout(null);
       this.setTitle("Hotelnow");
       this.setSize(VCAncho,VCAlto);
       this.setLocationRelativeTo(null);
       this.setResizable(false);
       crearComponentes();
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void crearComponentes(){
        crearPanel();
        crearIcon();
        crearLabel();
        crearBotones();
        Acciones();
    }
    public void Acciones(){
        BHome.setActionCommand("BHome");
        BHome.addActionListener(this);
        
        BContacto.setActionCommand("BContacto");
        BContacto.addActionListener(this);
    }
    public void crearPanel(){
        PHome= new JPanel();
        PHome.setLayout(null);
        PHome.setBounds(270, 20, 110, 60);
        this.getContentPane().add(PHome);
        
        PContacto= new JPanel();
        PContacto.setLayout(null);
        PContacto.setBounds(420, 20, 110, 60);
        this.getContentPane().add(PContacto);
        
        PServicios= new JPanel();
        PServicios.setLayout(null);
        PServicios.setBounds(570, 20, 110, 60);
        this.getContentPane().add(PServicios);
        
        PReservas= new JPanel();
        PReservas.setLayout(null);
        PReservas.setBounds(720, 20, 110, 60);
        this.getContentPane().add(PReservas);
        
        PContacto1= new JPanel();
        PContacto1.setLayout(null);
        PContacto1.setBounds(250, 100, 750, 700);
        this.getContentPane().add(PContacto1);
        PContacto1.setVisible(false);
        
        PControl2= new JPanel();
        PControl2.setLayout(null);
        PControl2.setBounds(250, 100, 750, 700);
        this.getContentPane().add(PControl2);
        
        
        PControl3= new JPanel();
        PControl3.setLayout(null);
        PControl3.setBounds(0, 0, 250, 800);
        this.getContentPane().add(PControl3);
    }
    public void crearIcon(){
        IControl1= new ImageIcon(getClass().getResource("/resource/Color1.png"));
        IControl2= new ImageIcon(getClass().getResource("/resource/Color2.png"));
        IControl3= new ImageIcon(getClass().getResource("/resource/Color3.png"));
        FInicio= new ImageIcon(getClass().getResource("/resource/Inicio.png"));
        IHome= new ImageIcon(getClass().getResource("/resource/Home.png"));
        IContacto = new ImageIcon(getClass().getResource("/resource/Contacto.png"));
        IServicios = new ImageIcon(getClass().getResource("/resource/Servicios.png"));
        IReservas = new ImageIcon(getClass().getResource("/resource/Reservas.png"));
    }
    public void crearLabel(){
        LControl1 = new JLabel();
        LControl1.setLayout(null);
        LControl1.setBounds(0, 0, VCAncho, VCAlto);
        LControl1.setIcon(new ImageIcon(IControl1.getImage().getScaledInstance(LControl1.getWidth(), LControl1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        this.getContentPane().add(LControl1);
    
        LContacto1 = new JLabel();
        LContacto1.setLayout(null);
        LContacto1.setBounds(0, 0, PContacto1.getWidth(), PContacto1.getHeight());
        LContacto1.setIcon(new ImageIcon(IControl2.getImage().getScaledInstance(LContacto1.getWidth(), LContacto1.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PContacto1.add(LContacto1);
        
        LControl2 = new JLabel();
        LControl2.setLayout(null);
        LControl2.setBounds(0, 0, PControl2.getWidth(), PControl2.getHeight());
        LControl2.setIcon(new ImageIcon(FInicio.getImage().getScaledInstance(LControl2.getWidth(), LControl2.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PControl2.add(LControl2);
        
        Logo1 = new JLabel("Hotel");
        Logo1.setBounds(20,20,180,40);
        Logo1.setFont(new Font("Times New Roman", Font.ITALIC, 40));
        Logo1.setForeground(Color.WHITE);
        PControl3.add(Logo1);
        Logo2 = new JLabel("SeSant&AlVi");
        Logo2.setBounds(30,70,180,30);
        Logo2.setFont(new Font("Edwardian Script ITC", Font.ITALIC, 30));
        Logo2.setForeground(Color.WHITE);
        PControl3.add(Logo2);
        
        LControl3 = new JLabel();
        LControl3.setLayout(null);
        LControl3.setBounds(0, 0, PControl3.getWidth(), PControl3.getHeight());
        LControl3.setIcon(new ImageIcon(IControl3.getImage().getScaledInstance(LControl3.getWidth(), LControl3.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PControl3.add(LControl3);
    }
    public void crearBotones(){
        BHome = new JButton();
        BHome.setLayout(null);
        BHome.setBounds(0, 0, 110, 60);
        BHome.setIcon(new ImageIcon(IHome.getImage().getScaledInstance(BHome.getWidth(), BHome.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PHome.add(BHome);
        
        BContacto = new JButton();
        BContacto.setLayout(null);
        BContacto.setBounds(0, 0, 110, 60);
        BContacto.setIcon(new ImageIcon(IContacto.getImage().getScaledInstance(BContacto.getWidth(), BContacto.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PContacto.add(BContacto);
        
        BServicios = new JButton();
        BServicios.setLayout(null);
        BServicios.setBounds(0, 0, 110, 60);
        BServicios.setIcon(new ImageIcon(IServicios.getImage().getScaledInstance(BServicios.getWidth(), BServicios.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PServicios.add(BServicios);
        
        BReservas = new JButton();
        BReservas.setLayout(null);
        BReservas.setBounds(0, 0, 110, 60);
        BReservas.setIcon(new ImageIcon(IReservas.getImage().getScaledInstance(BReservas.getWidth(), BReservas.getHeight(), Image.SCALE_AREA_AVERAGING)));
        PReservas.add(BReservas);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("BHome")){
            PContacto1.setVisible(false);
            PControl2.setVisible(true);
        }
        else if(ae.getActionCommand().equals("BContacto")){
            PControl2.setVisible(false);
            PContacto1.setVisible(true);
            
        }
    }
    
}
