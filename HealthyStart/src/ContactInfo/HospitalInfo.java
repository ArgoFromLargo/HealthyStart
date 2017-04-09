package ContactInfo;

public class HospitalInfo {
	private String hospitalName;
	private String phone;
	private String address;
	private	String headDoctor;
	//private List<Appointment> aptList;
		
	
	public HospitalInfo(String hospitalName, String phone, String address, String headDoctor)
	{
		this.hospitalName = hospitalName;
		this.phone = phone;
		this.address=address;
		this.headDoctor = headDoctor;
		//aptList = new List<Appointment>();
	}
	public String getAddress()
	{
		return address;
	}
	
	public String getHospitalName()
	{
		return hospitalName;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public String getHeadDoctor(){
		return headDoctor;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setHospitalName(String userhospitalName)
	{
		hospitalName = userhospitalName;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public void setHeadDoctor(String headDoctor){
		this.headDoctor = headDoctor;
	}
	
	public String toString(){
		return "hospitalName: " + this.getHospitalName() + "\nHead Doctor: "+this.getHeadDoctor()+ "\nPhone: "+this.getPhone()+"\naddress: "+this.getAddress()+"\n\n";
	}
}
