import java.util.*;

public class User
{
	private String id;
	private String address;
	private String name;
	private String phone;
	private List<Appointment> aptList;
	
    public User(String userName, String email, String phoneNum, String home)
    {
		name = userName;
		id = email;
		phone = phoneNum;
		address = home;
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
}
