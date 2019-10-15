import java.util.*;
public class reverse {
	
	ArrayList<String> reverseArray;
	
	public reverse(){
		reverseArray=new ArrayList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse r = new reverse();
		r.add();
		r.reverse1();
	}
	
	public void add(){

		reverseArray.add("chetan");
		reverseArray.add("pandurang");
		reverseArray.add("revankar");
		reverseArray.add("sujata");
		reverseArray.add("pooja");
		System.out.println(reverseArray);
	}
	
	public void reverse1(){
		Collections.reverse(reverseArray);
		System.out.println(reverseArray);
	}

}
