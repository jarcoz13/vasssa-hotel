
package gui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author User
 */
public class LoginTemplate extends JFrame{
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

    private ObjetosGraficos OG;
    private Recursos R;
    private LoginComponent loginComponent;

    /**
     * Metodos de los Objetos
     */

    public LoginTemplate(LoginComponent lc) {
        super("Login Steam");
        /**
         * Llamado de cada metodo de los objetos a la ventana y componentes de login
         */

        OG =  ObjetosGraficos.getService();
        R = Recursos.getService();
        this.loginComponent = lc;

        crearObjetosDecoradore();
        crearJPanels();
        crearJButton();
        crearJTextFiels();
        crearJPasswordFiels();
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

        pArriba = OG.buildJPanel(0,0,1200,100,R.getColor1(), null);
        this.add(pArriba);

        pIzquierda = OG.buildJPanel(0,100,700,500,R.getColor2(),null);
        this.add(pIzquierda);

        pDerecha = OG.buildJPanel(700,100,500,500,R.getColor3(),null);
        this.add(pDerecha);
    }

    public void crearObjetosDecoradore() {

        bordeTEntrada = BorderFactory.createLineBorder(R.getColorEntradaTex(),1,true);
        bordeBoton = BorderFactory.createLineBorder(R.getColorBoton(),1,false);
        bordeLista = BorderFactory.createMatteBorder(0,1,0,1,Color.WHITE);
    }

    public void crearJTextFiels() {

        tNameUser = OG.buildJTextField(null, 480, 140, 260, 30,"izquierda",
                R.getColorEntradaTex(),Color.WHITE,Color.WHITE,
                R.getFontEntrada(),bordeTEntrada
        );
        pIzquierda.add(tNameUser);
    }

    public void crearJPasswordFiels() {

        tPassword = OG.buidJPassword(null,480,220,260,30,"izquierda",
                R.getColorEntradaTex(),Color.WHITE,Color.WHITE,
                R.getFontEntrada(),bordeTEntrada
        );
        pIzquierda.add(tPassword);
    }

    public void crearJLabels() {

        lCompu = OG.buildJLabel(
                null,5,129,350,241,"","",
                iCompu,null,null,null,null);
        pDerecha.add(lCompu);

        lLogo = OG.buildJLabel(null,161,25,168,50,"","",
                R.getiLogo(),null,null,null,null
        );
        pArriba.add(lLogo);

        lInicio = OG.buildJLabel("INICIAR SESIÓN",350, 50, 250, 40,"","",
                null,null,Color.WHITE,R.getFontIniciar(),null
        );
        pIzquierda.add(lInicio);

        lTexName = OG.buildJLabel("<html><b>Usuario</b></html>",350, 120, 250, 20,"","",
                null,null,R.getColorLetra(),R.getFontPrincipal(),null
        );
        pIzquierda.add(lTexName);

        lTexPass = OG.buildJLabel("<html><b>Contraseña</b></html>",350, 200, 250, 20,"","",
                null,null,R.getColorLetra(),R.getFontPrincipal(),null
        );
        pIzquierda.add(lTexPass);

        lText1 = OG.buildJLabel("Centro de servicios HOTEL VASSSA",345,40,350,20,"","centro",
                null,null,R.getColorLetra(),R.getFontPrincipal(),null
        );


        lFondo = OG.buildJLabel(
                null,0,0,700,500,"","",iFondo,
                null,null,null,null
        );
        pIzquierda.add(lFondo);
    }

    public void crearJButton() {

        bEntrar = OG.buildJButton("<html><b>Inicia sesión</b></html>",360,270,240,30,"","",
                null,R.getColorBoton(),R.getColorLetraBoton(),R.getCursorMano(),true, R.getFontPrincipal(),bordeBoton
        );
        bEntrar.addActionListener(loginComponent);
        pIzquierda.add(bEntrar);


        bCerrar = OG.buildJButton(null,1172,10,20,20,"","",R.getiCerrar(),
                null,null,R.getCursorMano(),false, null,null
        );
        bCerrar.addActionListener(loginComponent);
        pArriba.add(bCerrar);

        bVentana = OG.buildJButton(null,1149,10,20,20,"","",R.getiVentana(),
                null,null,R.getCursorMano(),false,null,null
        );
        pArriba.add(bVentana);

        bMinimizar = OG.buildJButton(null,1126,10,20,20,"","",R.getiMinimizar(),
                null,null,R.getCursorMano(),false,null,null
        );
        pArriba.add(bMinimizar);
    }

    /**
     *  Obtencion de objetos para eventos


     */

    public JButton getbEntrar() { return bEntrar; }
    public JButton getbCerrar() { return  bCerrar; }

    public JTextField gettNameUser() { return tNameUser; }
    public JPasswordField gettPassword() { return this.tPassword; }
    public JComboBox<String> getCbIdiomaa() { return this.cbIdioma; }
}
