package UserData;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private static Data instance;
  List<User> users;
  private User currentUserName;

    public User getCurrentUserName() {
        return currentUserName;
    }

    public void setCurrentUserName(User currentUserName) {
        this.currentUserName = currentUserName;
    }

    private Data() {
        users = new ArrayList<>();
    }
    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
    public List<User> getUsers() {
        return users;
    }
    public void addUser(User user) {
        users.add(user);
    }
}
