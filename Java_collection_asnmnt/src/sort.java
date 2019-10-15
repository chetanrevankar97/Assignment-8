import java.util.*;
public class sort {
	
	ArrayList<String> sortArray;
	
	public sort(){
		sortArray=new ArrayList<String>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort s=new sort();
		s.add();
		s.sort1();
	}

	public void add(){

		sortArray.add("chetan");
		sortArray.add("pandurang");
		sortArray.add("revankar");
		sortArray.add("sujata");
		sortArray.add("pooja");
		System.out.println(sortArray);
	}
	
	public void sort1(){
		
		Collections.sort(sortArray);
		System.out.println(sortArray);
	}
}
