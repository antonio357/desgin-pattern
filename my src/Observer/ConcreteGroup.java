package Observer;

import java.util.ArrayList;

public class ConcreteGroup extends ObservableGroup {
    private ArrayList<Message> messages;

    public ArrayList<Message> getMessages() {
        return this.messages;
    }
    public void addMessage (Message message) {
        messages.add(message);
        notifyUsers();
    }
    public void listUsers () {
        System.out.println("Usuários cadastrados no grupo");
        for (ObserverUser observerUser : this.users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            System.out.println(concreteUser.getEmail());
        }
    }
}
