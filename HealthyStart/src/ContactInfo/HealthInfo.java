import java.util.ArrayList;
import java.util.List;

public class HealthInfo {
	List<String> HSLINKS = new ArrayList<String>();
	List<String> recommendedToys = new ArrayList<String>();
	List<String> educationalLinks = new ArrayList<String>();
	
	public void addHsLinks(String hsLink){
		for(String link : HSLINKS){
			HSLINKS.add(hsLink);
		}
	}
	
	public void addToysList(String toys){
		for(String toyList : recommendedToys){
			HSLINKS.add(toys);
		}
	}
	
	public void addEdLinks(String edLink){
		for(String otherLink : HSLINKS){
			HSLINKS.add(edLink);
		}
	}
}
