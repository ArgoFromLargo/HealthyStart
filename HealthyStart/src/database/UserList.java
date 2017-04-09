import java.util.*;

public class UserList{

    private List<User> users;

    public UserList()
    {
        this.users = new ArrayList<User>();
    }
    public List getUsers(){return this.users;}
    public void setUsers(List<User> users)
    {

        this.users = users;
    }

    public User getUser(int index)
    {
        
        return users.get(index);
    }

    public int size()
    {
        return users.size();
    }
}
