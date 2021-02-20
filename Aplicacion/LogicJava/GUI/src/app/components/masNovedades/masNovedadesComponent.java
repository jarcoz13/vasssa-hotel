package components.masNovedades;

public class masNovedadesComponent {

    private masNovedadesTemplate masNovedadesTemplate;

    public masNovedadesComponent() {
        masNovedadesTemplate = new masNovedadesTemplate(this);
    }

    public masNovedadesTemplate getMasNovedadesTemplate() { return masNovedadesTemplate; }
}
