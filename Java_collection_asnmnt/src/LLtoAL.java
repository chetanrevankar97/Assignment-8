import java.util.*;
public class LLtoAL {

	LinkedList<String> ll;
	
	public LLtoAL(){
		ll=new LinkedList<>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LLtoAL l=new LLtoAL();
		l.add();
		l.lltoal();
	}
	
	public void add(){

		ll.add("chetan");
		ll.add("pandurang");
		ll.add("chetan");
		ll.add("sujata");
		ll.add("Bye");
		System.out.println("Linked List");
		System.out.println(ll);
	}
	
	public void lltoal(){
		
		List ll2=new ArrayList<String>(ll);
		System.out.println("Array List");
		System.out.println(ll2);
	}

}
