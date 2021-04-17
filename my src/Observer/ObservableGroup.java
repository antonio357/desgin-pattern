package Observer;

import java.util.ArrayList;

public class ObservableGroup {
    protected ArrayList<ObserverUser> users;

    ObservableGroup () {
        users = new ArrayList<ObserverUser>();
    }
    public void addUser (ObserverUser user) {
        ConcreteObserver concreteUser = (ConcreteObserver) user;
        if (!userExists(concreteUser.getEmail())) {
            users.add(user);
            //System.out.println();
        }
        else System.out.println("add user fail, usuário " + concreteUser.getEmail() + " já está cadastrado no grupo");
    }
    public void delUser (String userEmail) {
        for (ObserverUser observerUser : users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            if (userEmail.equals(concreteUser.getEmail())) {
                //System.out.println("usuário " + concreteUser.getEmail() + " removido");
                users.remove(observerUser);
                return;
            }
        }
        System.out.println("remove user fail, usuário " + userEmail + " não está cadastrado no grupo");
    }
    protected void notifyUsers () {
        for (ObserverUser observerUser : users) {
            observerUser.updateGroupData();
        }
    }
    protected boolean userExists (String email) {
        //System.out.println("userExists");
        //System.out.println("searching for email = " + email);
        //System.out.println("users emails");
        for (ObserverUser observerUser : users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            //System.out.println(concreteUser.getEmail());
            if (email.equals(concreteUser.getEmail())) return true;
        }
        return false;
    }
}
