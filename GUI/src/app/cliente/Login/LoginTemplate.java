package cliente.Login;

import servicios.objetosGraficosServicios;
import servicios.recursosServicios;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class LoginTemplate extends JFrame {
    /**
     * Atributos de los Objetos
     *
     * Declaracion de los Objetos Graficos
     */

    private JPanel pIzquierda, pDerecha, pArriba; // paneles
    private JLabel lInicio, lTexName, lTexPass; // texto - titulo
    private JLabel lText1, lText2, lText3;
    private JLabel lFondo, lLogo, lCompu; // labels para imagenes
    private JTextField tNameUser; // Ingreso del Nombre de Usuario
    private JPasswordField tPassword; // Ingreso de la contraseña
    private JComboBox<String> cbIdioma; // tipo de usuario en una lista extendible
    private JButton bEntrar, bRegistrar, bText, bCerrar, bMinimizar,bVentana; // botones de accion
    //private JCheckBox chSi, chNo; // botones cuadrados de opcion
    //private ButtonGroup grupo; // funcion para q seleccione una opcion en el grupo de botones
    //private JRadioButton rbOpcion1, rbOpcion2; // botones redondos de opcion
    //private JTextArea taSugerencias; // cuadro de texto para parrafos

    // Declaracion de objetos decoradores
    private Border bordeTEntrada, bordeBoton, bordeLista; // bordes de cuadros
    private ImageIcon iFondo, iCompu; //imagenes para decoracion

    /**
     * Declaracion de servicios
     */

    private objetosGraficosServicios sObjetosGraficos;
    private recursosServicios sRecursos;
    private LoginComponent loginComponent;

    /**
     * Metodos de los Objetos
     */

    public LoginTemplate(LoginComponent lc) {
        super("Login Steam");
        /**
         * Llamado de cada metodo de los objetos a la ventana y componentes de login
         */

        sObjetosGraficos = objetosGraficosServicios.getService();
        sRecursos = recursosServicios.getService();
        this.loginComponent = lc;

        crearObjetosDecoradore();
        crearJPanels();
        crearJButton();
        crearJTextFiels();
        crearJPasswordFiels();
        crearJComboBoxs();
        crearJLabels();

        /**
         * Metodos propios de la ventana
         */

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // termina operacion al cerrar ventana
        this.setSize(1200, 600); // tamaño de la ventana
        this.setLocationRelativeTo(null); // Ubicacion de la ventana por comando
        this.setUndecorated(true);
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearJPanels() {

        pArriba = sObjetosGraficos.buildJPanel(0,0,1200,100,sRecursos.getColorGr1(), null);
        this.add(pArriba);

        pIzquierda = sObjetosGraficos.buildJPanel(0,100,700,500,sRecursos.getColorGr2(),null);
        this.add(pIzquierda);

        pDerecha = sObjetosGraficos.buildJPanel(700,100,500,500,sRecursos.getColorGr3(),null);
        this.add(pDerecha);
    }

    public void crearObjetosDecoradore() {

        bordeTEntrada = BorderFactory.createLineBorder(sRecursos.getColorEntradaTex(),1,true);
        bordeBoton = BorderFactory.createLineBorder(sRecursos.getColorBoton(),1,false);
        bordeLista = BorderFactory.createMatteBorder(0,1,0,1,Color.WHITE);

        iCompu = new ImageIcon("resources/imagines/join_pc.png");
        iFondo = new ImageIcon("resources/imagines/steam-library.png");
    }

    public void crearJTextFiels() {

        tNameUser = sObjetosGraficos.buildJTextField(
                null, 480, 140, 260, 30,"izquierda",
                sRecursos.getColorEntradaTex(),Color.WHITE,Color.WHITE,
                sRecursos.getFontEntrada(),bordeTEntrada
        );
        pIzquierda.add(tNameUser);
    }

    public void crearJPasswordFiels() {

        tPassword = sObjetosGraficos.buidJPassword(
                null,480,220,260,30,"izquierda",
                sRecursos.getColorEntradaTex(),Color.WHITE,Color.WHITE,
                sRecursos.getFontEntrada(),bordeTEntrada
        );
        pIzquierda.add(tPassword);
    }

    public void crearJLabels() {

        lCompu = sObjetosGraficos.buildJLabel(
                null,5,129,350,241,"","",
                iCompu,null,null,null,null);
        pDerecha.add(lCompu);

        lLogo = sObjetosGraficos.buildJLabel(
                null,161,25,168,50,"","",
                sRecursos.getiLogo(),null,null,null,null
        );
        pArriba.add(lLogo);

        lInicio = sObjetosGraficos.buildJLabel(
                "INICIAR SESIÓN",350, 50, 250, 40,"","",
                null,null,Color.WHITE,sRecursos.getFontIniciar(),null
        );
        pIzquierda.add(lInicio);

        lTexName = sObjetosGraficos.buildJLabel(
                "<html><b>Nombre de la cuenta de Steam</b></html>",350, 120, 250, 20,"","",
                null,null,sRecursos.getColorLetra(),sRecursos.getFontPrincipal(),null
        );
        pIzquierda.add(lTexName);

        lTexPass = sObjetosGraficos.buildJLabel(
                "<html><b>Contraseña</b></html>",350, 200, 250, 20,"","",
                null,null,sRecursos.getColorLetra(),sRecursos.getFontPrincipal(),null
        );
        pIzquierda.add(lTexPass);

        lText1 = sObjetosGraficos.buildJLabel(
                "<html><b>Es gratis y fácil de usar</b></html>",70,374,220,18,"centro","",
                null,null,sRecursos.getColorLetra(),sRecursos.getFontPrincipal(),null
        );
        pDerecha.add(lText1);

        lText2 = sObjetosGraficos.buildJLabel(
                "TIENDA   COMUNIDAD   ACERCA DE   SOPORTE",345,40,350,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getFontPrincipal(),null
        );
        pArriba.add(lText2);

        lText3 = sObjetosGraficos.buildJLabel(
                "<html><div style='text-align: center;'><b> Únete a steam y descubre miles<br> de titulos a los que jugar </b></div></html>",
                65,89,230,40,"centro","",null,null,
                sRecursos.getColorLetra(),sRecursos.getFontPrincipal(),null
        );
        pDerecha.add(lText3);

        lFondo = sObjetosGraficos.buildJLabel(
                null,0,0,700,500,"","",iFondo,
                null,null,null,null
        );
        pIzquierda.add(lFondo);
    }

    public void crearJButton() {

        bEntrar = sObjetosGraficos.buildJButton(
                "<html><b>Inicia sesión</b></html>",360,270,240,30,"","",
                null,sRecursos.getColorBoton(),sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),true, sRecursos.getFontPrincipal(),bordeBoton
        );
        bEntrar.addActionListener(loginComponent);
        pIzquierda.add(bEntrar);

        bRegistrar = sObjetosGraficos.buildJButton(
                "Únete a Steam",109,399,142,30,"","",
                null,sRecursos.getColorGr3(),Color.WHITE,sRecursos.getCursorMano(),true, sRecursos.getFontBoton2(), sRecursos.getBordeDefaul()
        );
        bRegistrar.addActionListener(loginComponent);
        pDerecha.add(bRegistrar);

        bText = sObjetosGraficos.buildJButton(
                "¿Has olvidado tu contraseña?",370,320,220,20,"","",
                null,null,Color.WHITE,sRecursos.getCursorMano(), false,sRecursos.getFontPri2(),null
        );
        pIzquierda.add(bText);

        bCerrar = sObjetosGraficos.buildJButton(
                null,1172,10,20,20,"","",sRecursos.getiCerrar(),
                null,null,sRecursos.getCursorMano(),false, null,null
        );
        bCerrar.addActionListener(loginComponent);
        pArriba.add(bCerrar);

        bVentana = sObjetosGraficos.buildJButton(
                null,1149,10,20,20,"","",sRecursos.getiVentana(),
                null,null,sRecursos.getCursorMano(),false,null,null
        );
        pArriba.add(bVentana);

        bMinimizar = sObjetosGraficos.buildJButton(
                null,1126,10,20,20,"","",sRecursos.getiMinimizar(),
                null,null,sRecursos.getCursorMano(),false,null,null
        );
        pArriba.add(bMinimizar);
    }

    public void crearJComboBoxs() {
        cbIdioma = sObjetosGraficos.buildJComboBox(
                "Español(Spanish)_Ingles(English)",980,10,120,20,"centro",
                sRecursos.getColorGr1(),Color.WHITE,sRecursos.getFontLista(),null
        );
        pArriba.add(cbIdioma);
    }

    /**
     *  Obtencion de ogjetos para eventos


     */

    public JButton getbRegistrar() { return bRegistrar; }
    public JButton getbEntrar() { return bEntrar; }
    public JButton getbCerrar() { return  bCerrar; }

    public JTextField gettNameUser() { return tNameUser; }
    public JPasswordField gettPassword() { return this.tPassword; }
    public JComboBox<String> getCbIdiomaa() { return this.cbIdioma; }
}
