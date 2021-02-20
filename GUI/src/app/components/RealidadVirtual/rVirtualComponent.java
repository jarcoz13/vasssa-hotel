package components.RealidadVirtual;

public class rVirtualComponent {

    private rVirtualTemplate rVirtualTemplate;

    public rVirtualComponent() {
        rVirtualTemplate = new rVirtualTemplate(this);
    }

    public rVirtualTemplate getrVirtualTemplate() { return rVirtualTemplate; }
}
