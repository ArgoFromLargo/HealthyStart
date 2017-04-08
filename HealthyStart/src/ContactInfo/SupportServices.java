import java.util.ArrayList;
import java.util.List;

public class SupportServices implements ISupportServices{
	
	private static List<HospitalInfo> hospitalInfo = new ArrayList<HospitalInfo>();
	
	public String toString(){
		/*for(HospitalInfo info : hospitalInfo){
			return info.toString();
		}*/
		return hospitalInfo.toString();
	}

}
