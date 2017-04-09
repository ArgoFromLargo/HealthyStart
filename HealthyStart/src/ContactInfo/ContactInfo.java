package ContactInfo;

import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
	
	private static List<CoordinatorInfo> coordinatorInfo = new ArrayList<CoordinatorInfo>();
	private static SupportServices supportServices;
	
	
	public static void addCoordinatorInfo(List<CoordinatorInfo> cInfo){
		cInfo.add(new CoordinatorInfo("Anne Scott","850-345-6789","aScott@healthystart.info"));
		cInfo.add(new CoordinatorInfo("Mike bryan","850-123-4567","mBryan@healthystart.info"));
		cInfo.add(new CoordinatorInfo("Jill Lewis","850-012-3456","jLewis@healthystart.info"));
		
		for(CoordinatorInfo info: cInfo){
			System.out.println(info.toString());
		}
	}
	
	//Function with interface to call hospital info and Health Start info (Have yet to implement that until i receive input)
	public static void getSupportServices(SupportServices supportServices){
		supportServices = new SupportServices();
		supportServices.toString();
	}
	
	public static void main(String[] args){
		addCoordinatorInfo(coordinatorInfo);
		getSupportServices(supportServices);//can pass in a string of service name to private that specific one;
	}

}
