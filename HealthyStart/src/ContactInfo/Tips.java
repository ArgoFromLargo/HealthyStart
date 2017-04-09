package ContactInfo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tips {
	
	static String fileName = "tips.txt";
	static List<String> tips = new ArrayList<String>();
	
	public static List<String> readFile(String fileName){
		try{
			String line;
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			while((line = br.readLine()) != null){
				if(!line.isEmpty()){
					tips.add(line);
				}
			}
			br.close();
			return tips;
		}
		catch(Exception e){
			System.out.println("Error with reading file");
			return null;
		}
		
	}
	
	public static void main(String[] args){
		List<String> temp = new ArrayList<String>();
		temp = readFile(fileName);
		
		for(int i=0; i<temp.size(); i++){
			String line= temp.get(i);
			System.out.println("Line[i] = " + line + "\n");
		}
		
		int max = temp.size();
		Random random = new Random();
		int randomNum;
		System.out.println("\n\n");
		for(int j=0; j<max; j++){
			randomNum = random.nextInt(max)+1;
			String randomLine = temp.get(randomNum);
			System.out.println("RanLine[" +randomNum+"] = "+ randomLine);
		}
		
	}

}
