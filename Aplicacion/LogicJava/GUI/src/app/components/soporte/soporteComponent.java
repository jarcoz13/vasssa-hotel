package components.soporte;

public class soporteComponent {

    private soporteTemplate soporteTemplate;

    public soporteComponent() {
        soporteTemplate = new soporteTemplate(this);
    }

    public soporteTemplate getSoporteTemplate() { return soporteTemplate; }
}
