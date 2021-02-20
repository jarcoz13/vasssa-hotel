package components.etiquetas;

public class etiquetasComponent {

    private etiquetasTemplate etiquetasTemplate;

    public etiquetasComponent() {
        etiquetasTemplate = new etiquetasTemplate(this);
    }

    public etiquetasTemplate getEtiquetasTemplate() { return etiquetasTemplate; }
}
