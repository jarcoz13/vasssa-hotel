package components.mentores;

public class mentoresComponent {

    private mentoresTemplate mentoresTemplate;

    public mentoresComponent() {
        mentoresTemplate = new mentoresTemplate(this);
    }

    public mentoresTemplate getMentoresTemplate() { return mentoresTemplate; }
}
