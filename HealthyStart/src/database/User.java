package database;

import java.util.*;

public class User
{

    private	String id;
    private String address;	//maybe do an address object?
    private String name;
    private String phone;
    private LinkedList<Appointment> aptList;


    public User()
    {
        id="";
        address="";
        name="";
        phone="";
        aptList = new LinkedList<Appointment>();
    }

    public User(String email, String add, String fullName, String phoneNum)
    {
        id = email;
        address = add;
        name = fullName;
        phone  = phoneNum;
        aptList = null;
    }
    public String getEmail()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAddress()
    {
        return address;
    }

    public Appointment getAppointment() {return aptList.getLast();}

    public void setEmail(String email)
    {
        id = email;
    }

    public void setName(String userName)
    {
        name = userName;
    }

    public void setAddress(String home)
    {
        address = home;
    }

    public void setPhone(String phoneNum)
    {
        phone = phoneNum;
    }

    public void addAptList(LinkedList<Appointment> ListofAppts)
    {
        this.aptList = ListofAppts;
    }

    public void addAppointment(Appointment apt)
    {
        aptList.add(apt);
    }

    public String printHistory()
    {
        String temp = "";
        Appointment aptTemp;
        for(int i = 0; i < this.aptList.size(); i++)
        {
            aptTemp = this.aptList.get(i);
            temp += aptTemp.printAppointment();
        }
        return temp;
    }

    public int getBabyScore()
    {
        int score = 0;
        double ratio = 0;


        /**** CALCULATE RATIO *************/
        for(int i = 0; i <this.aptList.size(); i++)
        {
            Appointment temp;
            temp = this.aptList.get(i);

            if(temp.getAttended())
                score++;
        }

        ratio = score/aptList.size();
        /***********************************/

        /********* DESCRETIZE TO A RANGE OF 1-4 *****************/
        if(ratio > .75)
            score = 4;
        else if(ratio > .50)
            score = 3;
        else if(ratio > .25)
            score = 2;
        else
            score = 1;
        /****************************************************/


        return score;
    }

}
