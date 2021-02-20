package components.disponibles;

public class disponiblesComponent {

    private disponiblesTemplate disponiblesTemplate;

    public disponiblesComponent() {
        disponiblesTemplate = new disponiblesTemplate(this);
    }

    public disponiblesTemplate getDisponiblesTemplate() { return disponiblesTemplate; }
}
