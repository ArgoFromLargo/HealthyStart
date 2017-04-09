/**
 * Created by jayz2053 on 4/8/17.
 */
import java.util.*;


public class Appointment
{

    private	String doctor;
    private	boolean attended;
    private	String scheduled; 	//further investigation required

    public Appointment(String date, String dr, boolean madeIt)
    {
        scheduled = date;
        doctor = dr;
        attended = madeIt;
    }

    public String getDoctor()
    {
        return doctor;
    }

    public boolean getAttended()
    {
        return attended;
    }

    public String getDate()
    {
        return scheduled;
    }

    public void setDoctor(String Dr)
    {
        doctor = Dr;
    }

    public void setAttended(boolean confirmed)
    {
        attended = confirmed;
    }

    public void setDate(String day)
    {
        scheduled = day;
    }

    public void printAppointment()
    {
        System.out.println(this.doctor + "\t" + this.scheduled +"\n" + attended+"\n");
    }

}
