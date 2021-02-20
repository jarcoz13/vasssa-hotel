package components.recomendaciones;

public class recomendacionesComponent {

    private recomendacioneTemplate recomendacioneTemplate;

    public recomendacionesComponent() {
        recomendacioneTemplate = new recomendacioneTemplate(this);
    }

    public recomendacioneTemplate getRecomendacioneTemplate() { return recomendacioneTemplate; }
}
