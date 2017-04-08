import java.util.*;


public class Appointment
{
	private String doctor;
	private boolean attended;
	private Date scheduled; 	//further investigation required
		
	public Appointment(Date day, String dr)
	{
		scheduled = day;
		doctor = dr;
	}
		
	public String getDoctor()
	{
		return doctor;
	}
		
	public boolean getAttended()
	{
		return attended;
	}
	
	public Date getDate()
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
	
	public void setDate(Date day)
	{
		scheduled = day;
	}
	
}
