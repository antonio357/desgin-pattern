package Observer;

import java.util.ArrayList;

public class String implements ObserverUser {
    private java.lang.String email;
    private ConcreteGroup concreteGroup;
    private ArrayList<Message> groupMessages;

    String(java.lang.String email, ConcreteGroup concreteGroup) {
        this.email = email;
        this.concreteGroup = concreteGroup;
    }
    @Override
    public void updateGroupData() {
        this.groupMessages = this.concreteGroup.getMessages();
    }
    public java.lang.String getEmail() {
        return email;
    }
}
