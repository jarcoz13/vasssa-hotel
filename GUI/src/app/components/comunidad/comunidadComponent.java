package components.comunidad;

public class comunidadComponent {

    private comunidadTemplate comunidadTemplate;

    public comunidadComponent() {
        comunidadTemplate = new comunidadTemplate(this);
    }

    public comunidadTemplate getComunidadTemplate() { return comunidadTemplate;}
}
