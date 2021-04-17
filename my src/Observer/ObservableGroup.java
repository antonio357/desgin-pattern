package Observer;

import java.util.ArrayList;

public class ObservableGroup {
    protected ArrayList<ObserverUser> users;

    public void addUser (ObserverUser user) {
        users.add(user);
    }
    public void delUser (String userEmail) {
        for (ObserverUser observerUser : users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            if (userEmail == concreteUser.getEmail()) {
                System.out.println("usuário " + concreteUser.getEmail() + " removido");
                users.remove(observerUser);
                return;
            }
        }
        System.out.println("remove user fail, usuário " + userEmail + " não estava cadastrado no grupo");
    }
    protected void notifyUsers () {
        for (ObserverUser observerUser : users) {
            observerUser.updateGroupData();
        }
    }
    protected boolean userExists (String email) {
        for (ObserverUser observerUser : users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            if (email == concreteUser.getEmail()) return true;
        }
        return false;
    }
}
