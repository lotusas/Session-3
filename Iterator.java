
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Iterator {
	private ArrayList<Query> queries;
	private Timestamp ts;
	private int old;
	private int index;
	private int aIndex;
	
	public Iterator(ArrayList<Query> queries){
		ts = new Timestamp(System.currentTimeMillis());
		old = Integer.parseInt(ts.toString().substring(20, 21));
		this.queries = queries;
		index = 0;
	}
	public String[] toArray(int index, int aIndex){
		String[] arr = queries.get(index).toString().split(" ");
		return arr;
	}
	public boolean hasNext() {	
		return queries.size() != index || aIndex > 0;
	}

	public String next() {
		if(hasNext()){
			if(aIndex > -1){
				String[] arr = toArray(index, aIndex);
				if(aIndex == 0){
					aIndex = arr.length;
				}
				aIndex--;
				if(aIndex == 0){
					aIndex --;
					return arr[arr.length - 1];
				}
				return arr[arr.length - 1 - aIndex];	
			}
				index++;
				aIndex = 0;
				Timestamp tsn = new Timestamp(System.currentTimeMillis());
				int ne = Integer.parseInt(tsn.toString().substring(20, 21));
				int res = ne - old;
				old = ne;
				return res + " miliseconds " + next();
		}
		throw new NoSuchElementException("There are no more words in the queries");
	}
}
