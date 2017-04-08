import java.util.*;


public class Appointment
{
	private:
		String doctor;
		boolean attended;
		Date scheduled; 	//further investigation required
		
	public:
		Appointment(Date day, String dr)
		{
			scheduled = day;
			doctor = dr;
		}
		
		String getDoctor()
		{
			return doctor;
		}
		
		boolean getAttended()
		{
			return attended;
		}
		
		Date getDate()
		{
			return scheduled;
		} 
		
		void setDoctor(String Dr)
		{
			doctor = dr;
		}
		
		void setAttended(boolean confirmed)
		{
			attended = confirmed;
		}
		
		void setDate(Date day)
		{
			scheduled = day;
		}
	
}
