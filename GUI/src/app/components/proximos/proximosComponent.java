package components.proximos;

public class proximosComponent {

    private proximosTemplate proximosTemplate;

    public proximosComponent() {
        proximosTemplate = new proximosTemplate(this);
    }

    public proximosTemplate getProximosTemplate() { return proximosTemplate; }
}
