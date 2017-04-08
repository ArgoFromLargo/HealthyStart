import java.util.*;

public class User
{
	private:
		String id;
		String address;	//maybe do an address object?
		String name;
		String phone;
		List<Appointment> aptList;
		
	public:
	    User(String userName, String email, String phoneNum, String home)
	    {
			name = userName;
			id = email;
			phone = phoneNum;
			address = home;
		}
		String getEmail()
		{
			return id;
		}
		
		String getName()
		{
			return name;
		}
		
		String getPhone()
		{
			return phone;
		}
		
		String getAddress()
		{
			return address;
		}
		
		void setEmail(String email)
		{
			id = email;
		}
		
		void setName(String userName)
		{
			name = userName;
		}
		
		void setAddress(String home)
		{
			address = home;
		}
		
		void setPhone(String phoneNum)
		{
			phone = phoneNum;
		}
		
}
