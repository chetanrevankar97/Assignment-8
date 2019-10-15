import java.util.*;
public class reverseLinkedList {
	
	LinkedList<String> reverse;
	
	public reverseLinkedList(){
		reverse=new LinkedList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLinkedList r=new reverseLinkedList();
		r.add();
		r.reverse1();
	}
	
	public void add(){

		reverse.add("chetan");
		reverse.add("pandurang");
		reverse.add("revankar");
		reverse.add("sujata");
		reverse.add("pooja");
		System.out.println(reverse);
	}
	
	public void reverse1(){
		int n=reverse.size();
		for(int i=n-1;i>=0;i--)
		System.out.println(reverse.get(i));
	}
}
