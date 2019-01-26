package hashMapUsingArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashMap mapObj = new CustomHashMap();
		
		mapObj.put("402", "Error");
		mapObj.put("200", "Success");
		mapObj.put("202", "something went wrong");
		
//		System.out.println(mapObj);
		System.out.println(mapObj.get("200"));
		mapObj.put("200", "Success msg was updated");
		System.out.println(mapObj.get("200"));
		
	}

}
