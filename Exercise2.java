import java.util.HashMap;

public class Exercise2 {
	//with sorting
	//public static boolean hasMajority(int[] arr){
	//	sort(arr);
	//	if(arr.length > 1){
	//		int num = arr[0];
	//		int x = 1;
	//		for(int i = 1; i < arr.length; i++){
	//			if(num == arr[i]){
	//				x++;
	//				if(x > arr.length / 2){
	//					return true;
	//				}
	//			}else{
	//				x = 1;
	//				num = arr[i];
	//			}
	//		}
	//	}
	//	if(arr.length == 1){
	//		return true;
	//	}
	//	return false;
	//}
	
	//public static void sort(int[] arr){
	//	if(arr == null || arr.length == 0){
	//		return;
	//	}
	//	quickSort(0, arr.length - 1, arr);
	//}
	
	//private static void quickSort(int lo, int hi, int[] arr){
		//int i = lo;
		//int j = hi;
		//int mid = arr[lo + (hi - lo) / 2];
		//while(i <= j){
		//	while(arr[i] < mid){
		//		i++;
		//	}
		//	while(arr[j] > mid){
		//		j--;
		//	}
		
		//    if(i <= j){
		//   	int temp = arr[i];
		//    	arr[i] = arr[j];
		//    	arr[j] = temp;
		//    	i++;
		//    	j--;
		//    }
		//}
		
		//if(lo < j){
		//	quickSort(lo, j, arr);
		//}
		//if(i < hi){
		//	quickSort(i, hi, arr);
		//}
	//}
	
	//with hashmap
	public static boolean hasMajority(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				int temp = map.get(arr[i]) + 1;
				map.put(arr[i], temp);
			}else{
				map.put(arr[i], 1);
			}
		}
		for(int s : map.keySet()){
			if(map.get(s) > arr.length / 2){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		//int[] arr = {};
		//majority at the start of the list
		//int[] arr = {3,5,6,5,3,4,3,3,3,3};
		//int[] arr = {1};
		//majority with negative numbers
		//int[] arr = {-1,2,-1};
		//majority at the end of the list
		//int[] arr = {2,1,2};
		//majority in the middle of the list
		//int[] arr = {2,-1,2,3,2};
		//no majority
		//int[] arr = {2,1};
		int[] arr = {5,4,-1}; 
		System.out.println(hasMajority(arr));
	}
}
