import java.util.ArrayList;

public class QueryStream {
	private ArrayList<Query> list;
	private Iterator iterate;

	public QueryStream(ArrayList<Query> list){
		this.list = list;
		iterate = new Iterator(list);
	}
	//
	public Iterator getIterator(){
		return iterate;
	}

	public static void main(String[] args){

		Query a = new Query("labas as tu jis ji");
		Query b = new Query("labas");
		Query c = new Query("as tu");
		Query d = new Query("");
		ArrayList<Query> list = new ArrayList<Query>();
		list.add(c); 
		list.add(b);
		list.add(d);
		list.add(a);

		QueryStream one = new QueryStream(list);
		Iterator it = one.getIterator(); 
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
	}


}
