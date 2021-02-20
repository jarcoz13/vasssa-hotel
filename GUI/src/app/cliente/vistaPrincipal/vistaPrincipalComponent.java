package cliente.vistaPrincipal;

import components.CompatibilidadconMando.mandoComponent;
import components.RealidadVirtual.rVirtualComponent;
import components.Tienda.tiendaComponent;
import components.amigos.amigosComponent;
import components.barraTitulo.barraTituloComponent;
import components.chat.chatComponent;
import components.comunidad.comunidadComponent;
import components.disponibles.disponiblesComponent;
import components.etiquetas.etiquetasComponent;
import components.masNovedades.masNovedadesComponent;
import components.mentores.mentoresComponent;
import components.navegacionUsuario.navegacionUsuarioComponent;
import components.novedades.novedadesComponent;
import components.ofertas.ofertasComponent;
import components.proximos.proximosComponent;
import components.recomendaciones.recomendacionesComponent;
import components.soporte.soporteComponent;
import components.usuario.usuarioComponent;
import components.ventas.ventasComponent;

import java.awt.*;

public class vistaPrincipalComponent {

    private vistaPrincipalTemplate vistaPrincipalTemplate;
    private barraTituloComponent btComponent;
    private navegacionUsuarioComponent nuComponent;
    private tiendaComponent tComponent;
    private comunidadComponent coComponent;
    private usuarioComponent uComponent;
    private chatComponent chComponent;
    private soporteComponent soComponent;
    private disponiblesComponent disComponent;
    private amigosComponent amComponenet;
    private mentoresComponent menComponent;
    private etiquetasComponent etqComponent;
    private recomendacionesComponent recComponent;
    private novedadesComponent novComponent;
    private ventasComponent venComponent;
    private masNovedadesComponent mnovComponent;
    private proximosComponent prxComponent;
    private ofertasComponent ofComponent;
    private rVirtualComponent rvComponent;
    private mandoComponent mandoComponent;

    public vistaPrincipalComponent() {

        vistaPrincipalTemplate = new vistaPrincipalTemplate(this);
        btComponent = new barraTituloComponent(this);
        nuComponent = new navegacionUsuarioComponent(this);

        vistaPrincipalTemplate.getpArriba().add(btComponent.getBarraTituloTemplate());
        vistaPrincipalTemplate.getpIzquierda().add(nuComponent.getNavegacionUsuarioTemplate());
    }

    public vistaPrincipalTemplate getVistaPrincipalTemplate() { return vistaPrincipalTemplate; }

    public void mostrarComponent(String comando) {
        vistaPrincipalTemplate.getpDerecha().removeAll();
        switch (comando) {
            case "TIENDA":
                if (tComponent == null)
                    tComponent = new tiendaComponent();
                vistaPrincipalTemplate.getpDerecha().add(tComponent.getTiendaTemplate());
                break;
            case "COMUNIDAD":
                if (coComponent == null)
                    coComponent = new comunidadComponent();
                vistaPrincipalTemplate.getpDerecha().add(coComponent.getComunidadTemplate());
                break;
            case "USUARIO":
                if (uComponent == null)
                    uComponent = new usuarioComponent();
                vistaPrincipalTemplate.getpDerecha().add(uComponent.getUsuarioTemplate());
                break;
            case "CHAT":
                if (chComponent == null)
                    chComponent = new chatComponent();
                vistaPrincipalTemplate.getpDerecha().add(chComponent.getChatTemplate());
                break;
            case "SOPORTE":
                if (soComponent == null)
                    soComponent = new soporteComponent();
                vistaPrincipalTemplate.getpDerecha().add(soComponent.getSoporteTemplate());
                break;
            case "Ya disponibles en Steam":
                if (disComponent == null)
                    disComponent = new disponiblesComponent();
                vistaPrincipalTemplate.getpDerecha().add(disComponent.getDisponiblesTemplate());
                break;
            case "Amigos":
                if (amComponenet == null)
                    amComponenet = new amigosComponent();
                vistaPrincipalTemplate.getpDerecha().add(amComponenet.getAmigosTemplate());
                break;
            case "Mentores":
                if (menComponent == null)
                    menComponent = new mentoresComponent();
                vistaPrincipalTemplate.getpDerecha().add(menComponent.getMentoresTemplate());
                break;
            case "Etiquetas":
                if (etqComponent == null)
                    etqComponent = new etiquetasComponent();
                vistaPrincipalTemplate.getpDerecha().add(etqComponent.getEtiquetasTemplate());
                break;
            case "Recomendaciones":
                if (recComponent == null)
                    recComponent = new recomendacionesComponent();
                vistaPrincipalTemplate.getpDerecha().add(recComponent.getRecomendacioneTemplate());
                break;
            case "Novedades":
                if (novComponent == null)
                    novComponent = new novedadesComponent();
                vistaPrincipalTemplate.getpDerecha().add(novComponent.getNovedadesTemplate());
                break;
            case "Lo más vendido":
                if (venComponent == null)
                    venComponent = new ventasComponent();
                vistaPrincipalTemplate.getpDerecha().add(venComponent.getVentasTemplate());
                break;
            case "Novedades.":
                if (mnovComponent == null)
                    mnovComponent = new masNovedadesComponent();
                vistaPrincipalTemplate.getpDerecha().add(mnovComponent.getMasNovedadesTemplate());
                break;
            case "Proxímamente":
                if (prxComponent == null)
                    prxComponent = new proximosComponent();
                vistaPrincipalTemplate.getpDerecha().add(prxComponent.getProximosTemplate());
                break;
            case "Ofertas":
                if (ofComponent == null)
                    ofComponent = new ofertasComponent();
                vistaPrincipalTemplate.getpDerecha().add(ofComponent.getOfertasTemplate());
                break;
            case "Realidad virtual":
                if (rvComponent == null)
                    rvComponent = new rVirtualComponent();
                vistaPrincipalTemplate.getpDerecha().add(rvComponent.getrVirtualTemplate());
                break;
            case "Compatibilidad con mando":
                if (mandoComponent == null)
                    mandoComponent = new mandoComponent();
                vistaPrincipalTemplate.getpDerecha().add(mandoComponent.getMandoTemplate());
                break;
        }
        vistaPrincipalTemplate.repaint();
    }

    public void cerrar() { System.exit(0); }
    public void minimizar() {
        this.vistaPrincipalTemplate.setExtendedState(Frame.ICONIFIED);
    }
}
