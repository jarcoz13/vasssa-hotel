package components.usuario;

public class usuarioComponent {

    private usuarioTemplate usuarioTemplate;

    public usuarioComponent() {
        usuarioTemplate = new usuarioTemplate(this);
    }

    public usuarioTemplate getUsuarioTemplate() { return usuarioTemplate; }
}
