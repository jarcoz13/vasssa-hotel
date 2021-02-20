package components.navegacionUsuario;

import servicios.objetosGraficosServicios;
import servicios.recursosServicios;

import javax.swing.*;
import java.awt.*;

public class navegacionUsuarioTemplate extends JPanel {

    private navegacionUsuarioComponent navegacionUsuarioComponent;
    private objetosGraficosServicios sObjetosGraficos;
    private recursosServicios sRecursos;

    private JLabel lSteam, lIndice1, lIndice2, lIndice3, lIndice4;
    private ImageIcon iSteam,iConsola,iEtiqueta, iMentores, iRecomoendaciones, iNovedades;
    private ImageIcon iGrUsuarios,iMas, iDimAux, iVendido, iReloj, iPorciento, iVR;
    private JButton bDisponibles, bAmigos, bMentores, bEtiquetas, bRecomendaciones, bNovedades;
    private JButton bVendido, bMasNovedades, bProximamente, bOfertas, bRVirtual, bMando;

    public navegacionUsuarioTemplate(navegacionUsuarioComponent nu) {

        sObjetosGraficos = objetosGraficosServicios.getService();
        sRecursos = recursosServicios.getService();
        navegacionUsuarioComponent = nu;

        crearObjetosDecoradore();
        crearJLabels();
        crearJButtons();

        this.setSize(300,600);
        this.setBackground(sRecursos.getColorFondoAzul());
        this.setLayout(null);
        this.setVisible(true);
    }

    public void crearObjetosDecoradore() {

        iSteam = new ImageIcon("resources/imagines/imagen1VP.png");
        iConsola = new ImageIcon("resources/imagines/consola.png");
        iGrUsuarios = new ImageIcon("resources/imagines/grupo-de-usuarios.png");
        iEtiqueta = new ImageIcon("resources/imagines/etiqueta.png");
        iMentores = new ImageIcon("resources/imagines/mentores.png");
        iMas = new ImageIcon("resources/imagines/mas.png");
        iRecomoendaciones = new ImageIcon("resources/imagines/recomendaciones.png");
        iNovedades = new ImageIcon("resources/imagines/novedades.png");
        iVendido = new ImageIcon("resources/imagines/vendido.png");
        iReloj = new ImageIcon("resources/imagines/reloj.png");
        iPorciento = new ImageIcon("resources/imagines/porcentaje.png");
        iVR = new ImageIcon("resources/imagines/VR.png");
    }

    public void crearJLabels() {
        iDimAux = new ImageIcon(iSteam.getImage().getScaledInstance(237,130, Image.SCALE_AREA_AVERAGING));
        lSteam = sObjetosGraficos.buildJLabel(
                "",50,30,237,130,"","",iDimAux,
                null, null,null,null
        );
        this.add(lSteam);

        lIndice1 = sObjetosGraficos.buildJLabel(
                "<html><b>TARGETAS REGALO</b></html>",50,162,237,13,"izquierda","",
                null,null,Color.WHITE,sRecursos.getFontPri2(),null
        );
        this.add(lIndice1);

        lIndice2 = sObjetosGraficos.buildJLabel(
                "<html><b>RECOMENDADOS</b></html>",50,218,237,13,"izquierda","",
                null,null,Color.WHITE,sRecursos.getFontPri2(),null
        );
        this.add(lIndice2);

        lIndice3 = sObjetosGraficos.buildJLabel(
                "<html><b>LISTAS DE DESCUBRIMIENTOS</b></html>",50,316,237,13,"izquierda",
                "", null,null,Color.WHITE,sRecursos.getFontPri2(),null
        );
        this.add(lIndice3);

        lIndice4 = sObjetosGraficos.buildJLabel(
                "<html><b>EXPLORAR CATEGORÍAS</b></html>",50,395,237,13,"izquierda",
                "", null,null,Color.WHITE,sRecursos.getFontPri2(),null
        );
        this.add(lIndice4);
    }

    public void crearJButtons() {
        bDisponibles = sObjetosGraficos.buildJButton(
                "<html><b>Ya disponibles en Steam</b></html>",50,190,237,13,"izquierda","",
                null,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,sRecursos.getFontPri2(),null
        );
        bDisponibles.addActionListener(navegacionUsuarioComponent);
        this.add(bDisponibles);

        iDimAux = new ImageIcon(iGrUsuarios.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bAmigos = sObjetosGraficos.buildJButton(
                "<html><b>Amigos</b></html>",50,246,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bAmigos.addActionListener(navegacionUsuarioComponent);
        this.add(bAmigos);

        iDimAux = new ImageIcon(iMentores.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bMentores = sObjetosGraficos.buildJButton(
                "<html><b>Mentores</b></html>",50,265,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bMentores.addActionListener(navegacionUsuarioComponent);
        this.add(bMentores);

        iDimAux = new ImageIcon(iEtiqueta.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bEtiquetas = sObjetosGraficos.buildJButton(
                "<html><b>Etiquetas</b></html>",50,283,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bEtiquetas.addActionListener(navegacionUsuarioComponent);
        this.add(bEtiquetas);

        iDimAux = new ImageIcon(iRecomoendaciones.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bRecomendaciones = sObjetosGraficos.buildJButton(
                "<html><b>Recomendaciones</b></html>",50,344,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bRecomendaciones.addActionListener(navegacionUsuarioComponent);
        this.add(bRecomendaciones);

        iDimAux = new ImageIcon(iNovedades.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bNovedades = sObjetosGraficos.buildJButton(
                "<html><b>Novedades</b></html>",50,362,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bNovedades.addActionListener(navegacionUsuarioComponent);
        this.add(bNovedades);

        iDimAux = new ImageIcon(iVendido.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bVendido = sObjetosGraficos.buildJButton(
                "<html><b>Lo más vendido</b></html>",50,423,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bVendido.addActionListener(navegacionUsuarioComponent);
        this.add(bVendido);

        iDimAux = new ImageIcon(iMas.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bMasNovedades = sObjetosGraficos.buildJButton(
                "<html><b>Novedades.</b></html>",50,441,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bMasNovedades.addActionListener(navegacionUsuarioComponent);
        this.add(bMasNovedades);

        iDimAux = new ImageIcon(iReloj.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bProximamente = sObjetosGraficos.buildJButton(
                "<html><b>Proxímamente</b></html>",50,459,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bProximamente.addActionListener(navegacionUsuarioComponent);
        this.add(bProximamente);

        iDimAux = new ImageIcon(iPorciento.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bOfertas = sObjetosGraficos.buildJButton(
                "<html><b>Ofertas</b></html>",50,476,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bOfertas.addActionListener(navegacionUsuarioComponent);
        this.add(bOfertas);

        iDimAux = new ImageIcon(iVR.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bRVirtual = sObjetosGraficos.buildJButton(
                "<html><b>Realidad virtual</b></html>",50,493,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bRVirtual.addActionListener(navegacionUsuarioComponent);
        this.add(bRVirtual);

        iDimAux = new ImageIcon(iConsola.getImage().getScaledInstance(13,13,Image.SCALE_AREA_AVERAGING));
        bMando = sObjetosGraficos.buildJButton(
                "<html><b>Compatibilidad con mando</b></html>",50,511,237,18,"izquierda","",
                iDimAux,null,sRecursos.getColorLetraBoton(),sRecursos.getCursorMano(),false,
                sRecursos.getFontPri2(),null
        );
        bMando.addActionListener(navegacionUsuarioComponent);
        this.add(bMando);
    }
}
