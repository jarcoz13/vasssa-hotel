package components.novedades;

public class novedadesComponent {

    private novedadesTemplate novedadesTemplate;

    public novedadesComponent() {
        novedadesTemplate = new novedadesTemplate(this);
    }

    public novedadesTemplate getNovedadesTemplate() { return novedadesTemplate; }
}
