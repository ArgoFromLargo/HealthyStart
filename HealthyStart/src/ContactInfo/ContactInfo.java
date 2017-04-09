import java.util.ArrayList;
import java.util.List;

public class ContactInfo {
	
	private static List<CoordinatorInfo> coordinatorInfo = new ArrayList<CoordinatorInfo>();
	private static List<HospitalInfo> hospitalInfo = new ArrayList<HospitalInfo>();
	
	
	public static void getCoordinatorInfo(List<CoordinatorInfo> cInfo){
		cInfo.add(new CoordinatorInfo("Anne Scott","850-345-6789","aScott@healthystart.info"));
		cInfo.add(new CoordinatorInfo("Mike bryan","850-123-4567","mBryan@healthystart.info"));
		cInfo.add(new CoordinatorInfo("Jill Lewis","850-012-3456","jLewis@healthystart.info"));
		
		for(CoordinatorInfo info: cInfo){
			System.out.println(info.toString());
		}
	}
	
	public static void getHospitalInfo(List<HospitalInfo> hInfo){
		hInfo.add(new HospitalInfo("Baptist Hosptital","123-456-7890","123 baptist dr","Samuel Pines"));
		hInfo.add(new HospitalInfo("West Florida Hospital","909-453-2346","1000 universty blvd","Muhatma ball"));
		hInfo.add(new HospitalInfo("Sacred Heart Hospital","850-321-3475","2300 N 9th ave","Joyce Edward"));
		
		for(HospitalInfo info: hInfo){
			System.out.println(info.toString());
		}
	}
	
	public static void viewInfo(String option){
		
		if(option == "Hospital"){
			getHospitalInfo(hospitalInfo);
		}
		else if(option == "Coordinator"){
			getCoordinatorInfo(coordinatorInfo);
		}
		else{
			//System.out.println("Please visit our home page: Healthystart.info for more Information\n");
			System.out.println("\n");
		}
		
	}
	
	/*public static void main(String[] args){
		System.out.println("Coordinator Contact:\n");
		getCoordinatorInfo(coordinatorInfo);
		//getSupportServices(supportServices);//can pass in a string of service name to private that specific one;
		System.out.println("\nHospital Information:\n");
		getHospitalInfo(hospitalInfo);
	}*/

}
