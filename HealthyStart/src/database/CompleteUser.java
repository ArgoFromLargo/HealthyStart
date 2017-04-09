/**
 * Created by jayz2053 on 4/9/17.
 */


import java.util.*;
import java.beans.*;
import java.io.*;
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
