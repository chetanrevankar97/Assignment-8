import java.util.*;
public class array_first_pos {
	
	ArrayList<Integer> array_first;
	int n=5;
	public array_first_pos(){
		
		array_first=new ArrayList<Integer>(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array_first_pos a= new array_first_pos();
		a.insertAtFirst();
		
	}
	
	public void insertAtFirst(){
		int i;
		for(i=0;i<n;i++){
			array_first.add(0,i);
		}
		
		System.out.println(array_first);
		
	}

}
