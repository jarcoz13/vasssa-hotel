/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class Recursos {
        private static Recursos servicio;

    private Color color1, color2, color3, colorLetra, colorEntradaTex, colorFondo;
    private Color colorBoton, colorLetraBoton; 
    private Font fontPrincipal, fontIniciar, fontEntrada;
    private Font fontBoton2, fontLista; // fuente o tipo de letra
    private Cursor cursorMano; // cursores
    private Border bordeDefaul; // bordes de cuadros
    private ImageIcon iLogo, iCerrar, iVentana, iMinimizar; //imagenes para decoracion

    private Recursos() {

        crearColores();
        crearFuentes();
        crearBordes();
        crearImagen();
        crearCursor();
    }

    public void crearColores() {
        color1 = new Color(52, 196, 212);
        color3 = new Color(33, 36, 41);
        color2 = new Color(34, 38, 43);
        colorLetra = new Color(143, 149, 152);
        colorEntradaTex = new Color(50, 53, 60);
        colorBoton = new Color(29, 105, 212);
        colorLetraBoton = new Color(95, 198, 245);
        colorFondo = new Color(20, 28, 124);
    }
    public Color getColor1() { return color1;}
    public Color getColor2() { return color2;}
    public Color getColor3() { return color3;}
    public Color getColorLetra() { return colorLetra;}
    public Color getColorEntradaTex() { return colorEntradaTex;}
    public Color getColorBoton() { return colorBoton;}
    public Color getColorLetraBoton() { return colorLetraBoton;}
    public Color getColorFondo() { return colorFondo;}

    public void crearFuentes() {
        fontPrincipal = new Font("Arial Nova", Font.PLAIN, 15);
        fontIniciar = new Font("Arial", Font.PLAIN, 30);
        fontEntrada = new Font("Arial Nova", Font.PLAIN, 15);
        fontBoton2 = new Font("Arial", Font.BOLD,15);
        fontLista = new Font("Arial",Font.PLAIN,9);
    }
    public Font getFontPrincipal() {return fontPrincipal;}
    public Font getFontIniciar() {return fontIniciar;}
    public Font getFontEntrada() {return fontEntrada;}
    public Font getFontBoton2() {return fontBoton2;}
    public Font getFontLista() {return fontLista;}

    public void crearCursor() {
        cursorMano = new Cursor(Cursor.HAND_CURSOR);
    }
    public Cursor getCursorMano() { return cursorMano;}

    public void crearBordes() {

        bordeDefaul = BorderFactory.createMatteBorder(1,1,1,1,Color.WHITE);

    }
    public Border getBordeDefaul() { return bordeDefaul;}

    public void crearImagen() {
        iLogo = new ImageIcon(getClass().getResource("/resource/hotel.png"));
        iCerrar = new ImageIcon(getClass().getResource("/resource/cerrar.png"));
        iVentana = new ImageIcon(getClass().getResource("/resource/ventana.png"));
        iMinimizar = new ImageIcon(getClass().getResource("/resource/minimizar.png"));
    }
    public ImageIcon getiLogo() { return iLogo;}
    public ImageIcon getiCerrar() { return iCerrar;}
    public ImageIcon getiVentana() { return iVentana;}
    public ImageIcon getiMinimizar() { return iMinimizar;}


    public static Recursos getService() {
        if (servicio == null) {
            servicio = new Recursos();
        }
        return servicio;

    }
}
