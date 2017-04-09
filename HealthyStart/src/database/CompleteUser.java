/**
 * Created by jayz2053 on 4/9/17.
 */
package database;

import java.util.*;
public class CompleteUser {

    private Database testDb = new Database();
    private AptDatabase testAptDb = new AptDatabase();
    private User tempUser;
    private LinkedList<Appointment> tempList;

    public CompleteUser(String email)
    {
        testDb = new Database();
        testAptDb = new AptDatabase();

        tempUser = testDb.LookupUser(email);
        tempList = testAptDb.LookupAppointments(tempUser.getName());
        tempUser.addAptList(tempList);
        //tempUser.printHistory();

    }

    public User getFinalProduct()
    {
        return tempUser;
    }
}
