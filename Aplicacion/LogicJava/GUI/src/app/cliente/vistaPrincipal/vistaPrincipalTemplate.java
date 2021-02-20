package cliente.vistaPrincipal;

import servicios.objetosGraficosServicios;
import servicios.recursosServicios;
import javax.swing.*;
//import java.awt.*;


// extends JFrame: extender una ventana
public class vistaPrincipalTemplate extends JFrame {

    private JPanel pIzquierda, pDerecha, pArriba;
    private JButton bCerrar, bVentana, bMinimizar;

    private objetosGraficosServicios sObjetosGraficos;
    private recursosServicios sRecursos;
    private vistaPrincipalComponent vistaPrincipalComponent;

    public vistaPrincipalTemplate(vistaPrincipalComponent vpc) {
        super("Vista Principal"); // titulo de la ventana

        /**
         * Llamado de cada metodo de los objetos a la ventana
         */

        sObjetosGraficos = objetosGraficosServicios.getService();
        sRecursos = recursosServicios.getService();
        this.vistaPrincipalComponent = vpc;

        crearPanels();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // termina operacion al cerrar ventana
        this.setSize(1300, 700); // tamaño de la ventana
        this.setLocationRelativeTo(null); // Ubicacion de la ventana por comando
        //this.setUndecorated(true);
        //this.getContentPane().setBackground(Color.getColor("blue",30)); // esto es el color de fondo
        this.setUndecorated(true);
        this.setLayout(null); // manejo de posicion para el programador
        this.setVisible(true); // visibilidad de la ventana
    }

    public void crearPanels() {
        pArriba = sObjetosGraficos.buildJPanel(0,0,1300,100,null, null);
        this.add(pArriba);

        pIzquierda = sObjetosGraficos.buildJPanel(0,100,300,600,null,null);
        this.add(pIzquierda);

        pDerecha = sObjetosGraficos.buildJPanel(300,100,1000,600,null,null);
        this.add(pDerecha);
    }

    public JPanel getpArriba() { return pArriba; }
    public JPanel getpIzquierda() { return pIzquierda; }
    public JPanel getpDerecha() { return pDerecha; }
}
