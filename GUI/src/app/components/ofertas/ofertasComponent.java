package components.ofertas;

public class ofertasComponent {

    private ofertasTemplate ofertasTemplate;

    public ofertasComponent() {
        ofertasTemplate = new ofertasTemplate(this);
    }

    public ofertasTemplate getOfertasTemplate() { return ofertasTemplate; }
}
