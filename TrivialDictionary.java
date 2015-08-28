
public class TrivialDictionary {
	//static String[] dict = {"bar", "car", "dentist", "elephant", "shoe"};
	//static String[] dict = {};
	static String[] dict = {"shoe"};
	
	public static String wordAt(int i){
		if(dict.length > i){
			return dict[i];
		}
		return null;
	}

}
