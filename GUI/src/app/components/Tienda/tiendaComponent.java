package components.Tienda;

public class tiendaComponent {

    private tiendaTemplate tiendaTemplate;

    public tiendaComponent () {

        tiendaTemplate = new tiendaTemplate(this);
    }

    public tiendaTemplate getTiendaTemplate() { return tiendaTemplate; }
}
