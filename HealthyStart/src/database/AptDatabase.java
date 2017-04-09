import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by jayz2053 on 4/9/17.
 */
public class AptDatabase {

    private HashMap<String, LinkedList<Appointment>> StoredAppt;

    public AptDatabase() {

        StoredAppt = new HashMap<String, LinkedList<Appointment>>();

        LinkedList<Appointment> Mary = new LinkedList<Appointment>();
        LinkedList<Appointment> Ashley = new LinkedList<Appointment>();
        LinkedList<Appointment> Rose = new LinkedList<Appointment>();
        LinkedList<Appointment> Dana = new LinkedList<Appointment>();

        Mary.add(new Appointment("10/12/16", "Dr. Chung", false));
        Mary.add(new Appointment("10/19/16", "Dr. Chung", false));
        Mary.add(new Appointment("10/26/16", "Dr.Chung", false));
        Mary.add(new Appointment("10/2816", "Dr. Chung", false));
        Mary.add(new Appointment("11/2/16", "Dr. Chung", true));

        Ashley.add(new Appointment("04/20/16", "Dr. Rosenfeld", true));
        Ashley.add(new Appointment("05/20/16", "Dr. Rosenfeld", true));
        Ashley.add(new Appointment("06/20/16", "Dr. Rosenfeld", false));

        Rose.add(new Appointment("01/05/17", "Dr. Sterling", true));
        Rose.add(new Appointment("02/17/17", "Dr. Sterling", false));

        Dana.add(new Appointment("04/10/17", "Dr. Chung", true));


        StoredAppt.put("Mary Jane", Mary);
        StoredAppt.put("Ashley Jones", Ashley);
        StoredAppt.put("Rose Abernathy", Rose);
        StoredAppt.put("Dana Peters", Dana);

    }

    public LinkedList<Appointment> LookupAppointments(String name)
    {
        return this.StoredAppt.getOrDefault(name, null);
    }



}
