package components.amigos;

public class amigosComponent {

    private amigosTemplate amigosTemplate;

    public amigosComponent() {
        amigosTemplate = new amigosTemplate(this);
    }

    public amigosTemplate getAmigosTemplate() { return amigosTemplate; }
}
