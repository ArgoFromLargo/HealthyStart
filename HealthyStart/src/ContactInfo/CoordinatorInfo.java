package ContactInfo;

public class CoordinatorInfo {
	
	
	private String name;
	private String phone;
	private	String email;
	//private List<Appointment> aptList;
		
	
	public CoordinatorInfo(String name, String phone, String email)
	{
		this.name = name;
		this.phone = phone;
		this.email=email;
		//aptList = new List<Appointment>();
	}
	public String getEmail()
	{
		return email;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhone()
	{
		return phone;
	}
	

	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setName(String userName)
	{
		name = userName;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String toString(){
		return "Name: " + this.getName() + "\nPhone: "+this.getPhone()+"\nEmail: "+this.getEmail()+"\n\n";
	}
	
}
