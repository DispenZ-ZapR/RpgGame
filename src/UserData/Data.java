package UserData;

import java.util.ArrayList;
import java.util.List;

public class Data {
    List<User> users = new ArrayList<User>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public void addUser(User user) {
        users.add(user);
    }
}
