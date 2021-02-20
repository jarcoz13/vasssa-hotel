package components.ventas;

public class ventasComponent {

    private ventasTemplate ventasTemplate;

    public ventasComponent() {
        ventasTemplate = new ventasTemplate(this);
    }

    public ventasTemplate getVentasTemplate() { return ventasTemplate; }
}
