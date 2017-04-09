import java.util.*;
import java.beans.*;
import java.io.*;

public class Database
{
    private static final String SERIALIZED_FILE_NAME="users.xml";


    private HashMap<String, User> userTable;
    private XMLDecoder decoder;

    public Database() {
        try {
            this.decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(SERIALIZED_FILE_NAME)));
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: file not found");
        }

        UserList list = new UserList();
        list.setUsers((ArrayList) decoder.readObject());

        this.userTable = new HashMap<String, User>();

        for(int i = 0; i < list.size(); i++) {
            User temp = list.getUser(i);
            userTable.put(temp.getEmail(), temp);
        }

    }

    public static String getSerializedFileName() {
        return SERIALIZED_FILE_NAME;
    }


    public User LookupUser(String email)
    {
        return this.userTable.getOrDefault(email,null);
    }

   /* public HashMap<String, User> getDatabase()
    {
        return this.userTable;
    }
    */

}