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
    private void showNewMessageReceived () {
        Message message = groupMessages.get(groupMessages.size() - 1);
        System.out.println(email + ", recebeu a menssagem");
    }
}
