package components.chat;

public class chatComponent {

    private chatTemplate chatTemplate;

    public chatComponent() {
        chatTemplate = new chatTemplate(this);
    }

    public chatTemplate getChatTemplate() { return chatTemplate; }
}
