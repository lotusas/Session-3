import java.util.Map;
import java.util.TreeMap;

public class Exercise3 {
	private TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
	private int size;
	
	//constructor sets the size and stores information from array to treeMap
	public Exercise3(int[] arr){
		size = arr.length;
		for(int i = 0; i < arr.length; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				int temp = map.get(arr[i]) + 1;
				map.put(arr[i], temp);
			}
		}
	}

	public Integer nthLargest(int a){
		if(a == 0 || size < a){
			throw new IllegalArgumentException("Integer out of range");
		} else{
			int start = size;
			for( Map.Entry<Integer, Integer> entry : map.entrySet()){
				start -= entry.getValue();
				if(start < a){
					return entry.getKey();
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		//int[] arr = {};
		//int[] arr = {1};
		//int[] arr = {1,-6, 2};
		//int[] arr = {-1,1,1,4,5,5,6,7,7,8};
		int[] arr = {2,2,2,2,2,2};
		//int[] arr = {2,10,24,16,1,1,7,2,2,2};
		
		Exercise3 temp = new Exercise3(arr);
		System.out.println(temp.nthLargest(1));
		//System.out.println(temp.nthLargest(3));
		//System.out.println(temp.nthLargest(9));
		//System.out.println(temp.nthLargest(10));
		//System.out.println(temp.nthLargest(0));
	}


}
