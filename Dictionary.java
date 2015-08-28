
public class Dictionary {
	
	//Linear solution (works with unsorted dictionary)
	//public boolean isInDictionary(String word){
	//	int i = 0;
	//	String nWord = TrivialDictionary.wordAt(i);
	//	while(nWord != null){
	//		i++;
	//		if(TrivialDictionary.wordAt(i) == word){
	//			return true;
	//		}
	//	}
	//	return false;
	//}
	
	//Works only if the dictionary is sorted, but
	//reduces the number of calls to TrivialDictionary.wordAt()
	public static boolean isInDictionary(String word){
		int length = length(2);
		if(length != -1 && binarySearch(word, length) >= 0){
			return true;
		}
		return false;
	}
		
	
	public static int binarySearch(String key, int length){
		int lo = 0;
		int hi = length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(key.compareToIgnoreCase(TrivialDictionary.wordAt(mid)) < 0){
				hi = mid - 1;
			} else if(key.compareToIgnoreCase(TrivialDictionary.wordAt(mid)) > 0){
				lo = mid + 1;
			} else return mid;
		}
		return -1;
	}
	
	public static int length(int num){
		if(num < 0){
			return -1;
		}else if(TrivialDictionary.wordAt(num) == null){
			return length(num - 1);	
		} else if(TrivialDictionary.wordAt(num + 1) == null){
			return num + 1;
		} else{
			return length(num * 2);
		}
	}
	
	public static void main(String[] args){
		System.out.println(isInDictionary("shoe"));
		System.out.println(length(2));
	}

}
