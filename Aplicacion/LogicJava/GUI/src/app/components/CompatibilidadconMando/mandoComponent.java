package components.CompatibilidadconMando;

public class mandoComponent {

    private mandoTemplate mandoTemplate;

    public mandoComponent() {
        mandoTemplate = new mandoTemplate(this);
    }

    public mandoTemplate getMandoTemplate() { return mandoTemplate; }
}
