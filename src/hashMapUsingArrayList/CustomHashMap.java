package hashMapUsingArrayList;

import java.util.ArrayList;
import java.util.List;

public class CustomHashMap {
	
	private Bucket bucket;
	private List<Bucket> list;
	
	public CustomHashMap() {
		this.list = new ArrayList<Bucket>();
	}
	
	public void put(Object k, Object v) {
		bucket = new Bucket();
		bucket.insert(k, v);
//		check for duplicate key
		for (int i = 0; i < list.size(); i++) {
			Bucket tempBuckrt = list.get(i);
			if(tempBuckrt.key.equals(k)) {
				// remove duplicate object
				list.remove(i);
				break;
			}
		}
		list.add(bucket);
	}
	
	public Object get(Object k) { 
		for (int i = 0; i < list.size(); i++) {
			Bucket tempBuckrt = list.get(i);
			if(k.toString()==tempBuckrt.key.toString()) {
				return tempBuckrt.value;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomHashMap [bucket=" + bucket + ", list=" + list + "]";
	}
	
	
}
