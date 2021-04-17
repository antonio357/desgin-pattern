package Observer;

import java.util.ArrayList;

public class ObservableGroup {
    private ArrayList<ObserverUser> users;

    public void addUser (ObserverUser user) {
        users.add(user);
    }
    public void delUser (String userEmail) {
        for (ObserverUser observerUser : this.users) {
            ConcreteObserver concreteUser = (ConcreteObserver) observerUser;
            if (userEmail == concreteUser.getEmail()) users.remove(observerUser);
        }
    }
}
