package servicios;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class objetosGraficosServicios {

    private static objetosGraficosServicios servicio;

    private JPanel panel;
    private JTextField textField;
    private JPasswordField password;
    private JLabel label;
    private JButton boton;
    private JComboBox comboBox;

    private objetosGraficosServicios() {

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
            case "derecha": textField.setHorizontalAlignment(SwingConstants.RIGHT);
            break;
            case "izquierda": textField.setHorizontalAlignment(SwingConstants.LEFT);
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
            case "derecha": password.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": password.setHorizontalAlignment(SwingConstants.LEFT);
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
            case "derecha": label.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": label.setHorizontalAlignment(SwingConstants.LEFT);
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
            case "derecha": boton.setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": boton.setHorizontalAlignment(SwingConstants.LEFT);
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
            case "derecha": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
                break;
            case "izquierda": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.LEFT);
                break;
            case "centro": ((JLabel) comboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
                break;
            default:
                break;
        }

        return comboBox;
    }

    public static objetosGraficosServicios getService() {
        if (servicio == null) {
            servicio = new objetosGraficosServicios();
        }
        return servicio;
    }
}
