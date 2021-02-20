package servicios;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class recursosServicios {

    private static recursosServicios servicio;

    private Color colorGr1, colorGr2, colorGr3, colorLetra, colorEntradaTex, colorFondoAzul;
    private Color colorBoton, colorLetraBoton; // colores
    private Font fontPrincipal, fontIniciar, fontEntrada, fontPri2;
    private Font fontBoton2, fontLista, fontLigera; // fuente o tipo de letra
    private Cursor cursorMano; // cursores
    private Border bordeDefaul, bordeVacio; // bordes de cuadros
    private ImageIcon iLogo, iCerrar, iVentana, iMinimizar; //imagenes para decoracion

    private recursosServicios() {

        crearColores();
        crearFuentes();
        crearBordes();
        crearImagen();
        crearCursor();
    }

    public void crearColores() {
        colorGr1 = new Color(23, 26, 33);
        colorGr3 = new Color(33, 36, 41);
        colorGr2 = new Color(34, 38, 43);
        colorLetra = new Color(143, 149, 152);
        colorEntradaTex = new Color(50, 53, 60);
        colorBoton = new Color(29, 105, 212);
        colorLetraBoton = new Color(95, 198, 245);
        colorFondoAzul = new Color(26, 70, 96);
    }
    public Color getColorGr1() { return colorGr1;}
    public Color getColorGr2() { return colorGr2;}
    public Color getColorGr3() { return colorGr3;}
    public Color getColorLetra() { return colorLetra;}
    public Color getColorEntradaTex() { return colorEntradaTex;}
    public Color getColorBoton() { return colorBoton;}
    public Color getColorLetraBoton() { return colorLetraBoton;}
    public Color getColorFondoAzul() { return colorFondoAzul;}

    public void crearFuentes() {
        fontPrincipal = new Font("Arial Nova", Font.PLAIN, 15);
        fontIniciar = new Font("Arial", Font.PLAIN, 30);
        fontEntrada = new Font("Arial Nova", Font.PLAIN, 15);
        fontPri2 = new Font("Arial Nova",Font.PLAIN,13);
        fontBoton2 = new Font("Arial", Font.BOLD,15);
        fontLista = new Font("Arial",Font.PLAIN,9);
    }
    public Font getFontPrincipal() {return fontPrincipal;}
    public Font getFontIniciar() {return fontIniciar;}
    public Font getFontEntrada() {return fontEntrada;}
    public Font getFontPri2() {return fontPri2;}
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
        iLogo = new ImageIcon("resources/imagines/logo steam.png");
        iCerrar = new ImageIcon("resources/imagines/cerrar.png");
        iVentana = new ImageIcon("resources/imagines/ventana.png");
        iMinimizar = new ImageIcon("resources/imagines/minimizar.png");
    }
    public ImageIcon getiLogo() { return iLogo;}
    public ImageIcon getiCerrar() { return iCerrar;}
    public ImageIcon getiVentana() { return iVentana;}
    public ImageIcon getiMinimizar() { return iMinimizar;}


    public static recursosServicios getService() {
        if (servicio == null) {
            servicio = new recursosServicios();
        }
        return servicio;

    }
}
