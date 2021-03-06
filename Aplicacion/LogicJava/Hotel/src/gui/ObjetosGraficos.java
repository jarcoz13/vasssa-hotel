/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class ObjetosGraficos {
    private static ObjetosGraficos servicio;

    private JPanel panel;
    private JTextField textField;
    private JPasswordField password;
    private JLabel label;
    private JButton boton;
    private JComboBox comboBox;

    private ObjetosGraficos() {

    }

    public JPanel buildJPanel(int x, int y, int ancho, int alto, Color colorFondo, Border borde) {
        panel = new JPanel();
        panel.setBounds(x,y,ancho,alto);
        panel.setBackground(colorFondo);
        panel.setBorder(borde);
        panel.setLayout(null);
        return panel;
    }

    public JTextField buildJTextField(
            String txt,int x, int y, int ancho, int alto,String txtPosi,
            Color colorFondo, Color txtColor,Color colorCaret,
            Font fuente, Border borde
    ) {
        textField = new JTextField(txt);
        textField.setSize(ancho,alto);
        textField.setLocation(x - ancho / 2, y);
        textField.setBackground(colorFondo);
        textField.setForeground(txtColor);
        textField.setCaretColor(colorCaret);
        textField.setFont(fuente);
        textField.setBorder(borde);

        switch (txtPosi){
            case "der": textField.setHorizontalAlignment(SwingConstants.RIGHT);
            break;
            case "izq": textField.setHorizontalAlignment(SwingConstants.LEFT);
            break;
            case "centro": textField.setHorizontalAlignment(SwingConstants.CENTER);
            break;
            default:
                break;
        }
        return textField;
    }

    public JPasswordField buidJPassword(
            String txt,int x, int y,int ancho, int alto, String txtPosi,
            Color colorfondo, Color txtColor,Color colorCaret,
            Font fuente, Border borde
    ) {
        password = new JPasswordField(txt);
        password.setSize(ancho,alto);
        password.setLocation(x - ancho / 2, y);
        password.setBackground(colorfondo);
        password.setForeground(txtColor);
        password.setCaretColor(colorCaret);
        password.setFont(fuente);
        password.setBorder(borde);

        switch (txtPosi){
            case "der": password.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izq": password.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": password.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }

        return password;
    }

    public JLabel buildJLabel(
            String txt, int x, int y, int ancho, int alto, String txtPosiX,String txtPosiY,
            ImageIcon imagen, Color colorFondo, Color txtColor,
            Font fuente, Border borde
    ) {
        label = new JLabel(txt);
        label.setBounds(x,y,ancho,alto);
        label.setBackground(colorFondo);
        label.setForeground(txtColor);
        label.setIcon(imagen);
        label.setFont(fuente);
        label.setBorder(borde);

        switch (txtPosiX){
            case "der": label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izq": label.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": label.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        switch (txtPosiY){
            case "arriba": label.setVerticalAlignment(SwingConstants.TOP);
                break;
            case "abajo": label.setVerticalAlignment(SwingConstants.BOTTOM);
                break;
            case "centro": label.setVerticalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return label;
    }

    public JButton buildJButton(
            String txt, int x, int y, int ancho, int alto, String txtPosiX,String txtPosiY,
            ImageIcon imagen, Color colorFondo, Color txtColor,Cursor cursor,boolean area,
            Font fuente, Border borde
    ) {
        boton = new JButton(txt);
        boton.setBounds(x,y,ancho,alto);
        boton.setContentAreaFilled(area);
        boton.setFocusable(false);
        boton.setIcon(imagen);
        boton.setBackground(colorFondo);
        boton.setForeground(txtColor);
        boton.setCursor(cursor);
        boton.setFont(fuente);
        boton.setBorder(borde);

        switch (txtPosiX){
            case "der": boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izq": boton.setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": boton.setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        switch (txtPosiY){
            case "arriba": boton.setVerticalAlignment(SwingConstants.TOP);
                break;
            case "abajo": boton.setVerticalAlignment(SwingConstants.BOTTOM);
                break;
            case "centro": boton.setVerticalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }
        return boton;
    }

    public JComboBox<String> buildJComboBox(
            String cadena, int x, int y, int ancho, int alto, String txtPosi,
            Color colorFondo, Color txtColor, Font fuente, Border borde
    ) {
        comboBox = new JComboBox<String>();
        comboBox.setBounds(x,y,ancho,alto);
        for (String item : cadena.split( "_" )){
            comboBox.addItem("<html><b>" + item + "</b></html>");
        }
        comboBox.setBackground(colorFondo);
        comboBox.setForeground(txtColor);
        comboBox.setFont(fuente);
        comboBox.setBorder(borde);
        comboBox.setFocusable(false);

        switch (txtPosi){
            case "der": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izq": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }

        return comboBox;
    }

    public static ObjetosGraficos getService() {
        if (servicio == null) {
            servicio = new ObjetosGraficos();
        }
        return servicio;
    }
}
