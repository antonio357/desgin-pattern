package Observer;

import java.util.ArrayList;

public class ConcreteGroup extends ObservableGroup {
    private ArrayList<Message> messages;

    ConcreteGroup() {}
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
    public void addMessage (Message message) {
        messages.add(message);
    }
}
