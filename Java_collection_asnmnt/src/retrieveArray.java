import java.util.*;
public class retrieveArray {
	
	ArrayList<String> array_retrieve;
	public retrieveArray(){
		
		array_retrieve=new ArrayList<String>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		retrieveArray r=new retrieveArray();
		r.add();
		r.retrieve();
	}
	
	public void add(){

		array_retrieve.add("Chetan");
		array_retrieve.add("Pandurang");
		array_retrieve.add("Revankar");
		System.out.println(array_retrieve);
	}

	public void retrieve(){
		
		int pos,i;
		String ret;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter position to retrieve");
		pos=sc.nextInt();
		
		ret=array_retrieve.get(pos);
		System.out.println("Element at position: "+pos+" is: "+ret);
	}
}
