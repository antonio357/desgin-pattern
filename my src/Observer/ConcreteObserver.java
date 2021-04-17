package Observer;

import java.util.ArrayList;

public class ConcreteObserver implements ObserverUser {
    private String email;
    private ConcreteGroup concreteGroup;
    private ArrayList<Message> groupMessages;

    ConcreteObserver(String email, ConcreteGroup concreteGroup) {
        this.email = email;
        this.concreteGroup = concreteGroup;
    }
    @Override
    public void updateGroupData() {
        this.groupMessages = this.concreteGroup.getMessages();
    }
    public String getEmail() {
        return email;
    }
}
