import java.util.*;
public class search {
	
	ArrayList<String> searchArray;
	public search(){
		
		searchArray=new ArrayList<String>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search s=new search();
		s.add();
		s.search_array();
	}
	
	public void add(){

		searchArray.add("chetan");
		searchArray.add("pandurang");
		searchArray.add("revankar");
		searchArray.add("sujata");
		searchArray.add("pooja");
		System.out.println(searchArray);
	}

	public void search_array() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search");
		String search=sc.next();
		
		if(searchArray.contains(search)){
			System.out.println("Element found");
		}
		else
			System.out.println("Element not found");
	}

}
