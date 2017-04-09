import java.beans.*;
import java.util.*;
import java.io.*;

public class ToXML
{
    private static final String SERIALIZED_FILE_NAME = "users.xml";

    public static void main(String[] args)
    {
        User Mary = new User("dumptruck@yahoo.com","132 Road Pensacola 32504", "Mary Jane", "555-1234");
        User Ashley = new User("someEmail@yahoo.com", "5321 Street Pensacola 32514", "Ashley Jones", "555-1357");
        User Rose = new User("Iloveflowers@gmail.com", "7859 Highway Cantoment Florida 32504", "Rose Abernathy", "555-9634");
        User Dana = new User("gettingOld@hotmail.com", "9875 Street Pace 32571", "Dana Peters", "555-8927");

        /*
        Mary.addAppointment(new Appointment("10/12/16", "Dr. Chung", false));
        Mary.addAppointment(new Appointment("10/19/16", "Dr. Chung", false));
        Mary.addAppointment(new Appointment("10/26/16", "Dr.Chung", false));
        Mary.addAppointment(new Appointment("10/2816", "Dr. Chung", false));
        Mary.addAppointment(new Appointment("11/2/16", "Dr. Chung",  true));

        Ashley.addAppointment(new Appointment("04/20/16", "Dr. Rosenfeld", true));
        Ashley.addAppointment(new Appointment("05/20/16", "Dr. Rosenfeld", true));
        Ashley.addAppointment(new Appointment("06/20/16", "Dr. Rosenfeld", false));

        Rose.addAppointment(new Appointment("01/05/17", "Dr. Sterling", true));
        Rose.addAppointment(new Appointment("02/17/17" , "Dr. Sterling" ,false));

        Dana.addAppointment(new Appointment("04/10/17", "Dr. Chung", true));
    */
        List userList = new ArrayList();
        userList.add(Mary);
        userList.add(Ashley);
        userList.add(Rose);
        userList.add(Dana);

        XMLEncoder encoder = null;
        try{

            encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(SERIALIZED_FILE_NAME)));
        }catch(FileNotFoundException fileNotFound){
            System.out.println("ERROR: While Creating or Opening the users.xml");
        }


        encoder.writeObject(userList);

        encoder.close();
    }
}
