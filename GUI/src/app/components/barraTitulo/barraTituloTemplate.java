package components.barraTitulo;

import servicios.objetosGraficosServicios;
import servicios.recursosServicios;

import javax.swing.*;
import java.awt.*;

public class barraTituloTemplate extends JPanel {

    private barraTituloComponent barraTituloComponent;
    private objetosGraficosServicios sObjetosGraficos;
    private recursosServicios sRecursos;

    private JButton bCerrar, bVentana, bMinimizar, bCarta, bInterrogante;
    private JButton bTienda, bComunidad ,bUsuario, bChat, bSoporte;
    private JLabel lLogo;
    private ImageIcon iLogo, iDimAux, iCarta, iInterrogante;
    private JComboBox cbPerfil;

    public barraTituloTemplate(barraTituloComponent bt) {

        sObjetosGraficos = objetosGraficosServicios.getService();
        sRecursos = recursosServicios.getService();
        this.barraTituloComponent = bt;

        crearObjetosDecoradore();
        crearButtons();
        crearJLabels();
        crearJComboBoxs();

        this.setSize(1300,100);
        this.setBackground(sRecursos.getColorGr1());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradore() {
        iCarta = new ImageIcon("resources/imagines/carta.png");
        iInterrogante = new ImageIcon("resources/imagines/interrogante.png");
    }

    public void crearJLabels() {
        lLogo = sObjetosGraficos.buildJLabel(
                null,300,25,168,50,"","",
                sRecursos.getiLogo(),null,null,null,null
        );
        this.add(lLogo);
    }

    public void crearButtons() {
        bCerrar = sObjetosGraficos.buildJButton(
                null,1270,10,20,20,"","",sRecursos.getiCerrar(),
                null,null,sRecursos.getCursorMano(),false, null,null
        );
        bCerrar.addActionListener(barraTituloComponent);
        this.add(bCerrar);

        bVentana = sObjetosGraficos.buildJButton(
                null,1247,10,20,20,"","",sRecursos.getiVentana(),
                null,null,sRecursos.getCursorMano(),false,null,null
        );
        this.add(bVentana);

        bMinimizar = sObjetosGraficos.buildJButton(
                null,1224,10,20,20,"","",sRecursos.getiMinimizar(),
                null,null,sRecursos.getCursorMano(),false,null,null
        );
        bMinimizar.addActionListener(barraTituloComponent);
        this.add(bMinimizar);

        iDimAux = new ImageIcon(iCarta.getImage().getScaledInstance(20,20,Image.SCALE_AREA_AVERAGING));
        bCarta = sObjetosGraficos.buildJButton(
                null,1024,10,20,20,"","",iDimAux,null,null,
                sRecursos.getCursorMano(),false,null,null
        );
        this.add(bCarta);

        iDimAux = new ImageIcon(iInterrogante.getImage().getScaledInstance(20,20,Image.SCALE_AREA_AVERAGING));
        bInterrogante = sObjetosGraficos.buildJButton(
                null,1047,10,20,20,"","",iDimAux,null,null,
                sRecursos.getCursorMano(),false,null,null
        );
        this.add(bInterrogante);

        bTienda = sObjetosGraficos.buildJButton(
                "TIENDA",538,40,60,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getCursorMano(),
                false,sRecursos.getFontPrincipal(),null
        );
        bTienda.addActionListener(barraTituloComponent);
        this.add(bTienda);

        bComunidad = sObjetosGraficos.buildJButton(
                "COMUNIDAD",613,40,100,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getCursorMano(),
                false,sRecursos.getFontPrincipal(),null
        );
        bComunidad.addActionListener(barraTituloComponent);
        this.add(bComunidad);

        bUsuario = sObjetosGraficos.buildJButton(
                "USUARIO",728,40,80,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getCursorMano(),
                false,sRecursos.getFontPrincipal(),null
        );
        bUsuario.addActionListener(barraTituloComponent);
        this.add(bUsuario);

        bChat = sObjetosGraficos.buildJButton(
                "CHAT",823,40,40,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getCursorMano(),
                false,sRecursos.getFontPrincipal(),null
        );
        bChat.addActionListener(barraTituloComponent);
        this.add(bChat);

        bSoporte = sObjetosGraficos.buildJButton(
                "SOPORTE",878,40,100,20,"","centro",
                null,null,sRecursos.getColorLetra(),sRecursos.getCursorMano(),
                false,sRecursos.getFontPrincipal(),null
        );
        bSoporte.addActionListener(barraTituloComponent);
        this.add(bSoporte);
    }
    public void crearJComboBoxs() {
        cbPerfil = sObjetosGraficos.buildJComboBox(
                "Usuario_Ver perfil_Detalles de cuenta_Cerrar sesión_Preferencias_Cambiar idioma",
                1070,10,130,20,"centro",
                sRecursos.getColorGr1(), Color.WHITE,sRecursos.getFontLista(),null
        );
        this.add(cbPerfil);
    }

    public JButton getbCerrar() { return  bCerrar; }
    public JButton getbMinimizar() { return bMinimizar; }
}
