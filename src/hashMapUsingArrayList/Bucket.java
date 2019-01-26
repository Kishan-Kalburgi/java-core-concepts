package hashMapUsingArrayList;

public class Bucket {
	
	Object key;
	Object value;
	
	public void insert(Object k, Object v){
		this.key=k;
		this.value=v;
	}

	@Override
	public String toString() {
		return "Bucket [key=" + key + ", value=" + value + "]";
	}
	
}
