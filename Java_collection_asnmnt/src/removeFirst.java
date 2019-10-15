import java.util.*;
public class removeFirst {
	
	LinkedList<String> remove;
	
	public removeFirst(){
		remove=new LinkedList<>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeFirst rf=new removeFirst();
		rf.add();
		rf.remove1();
	}
	
	public void add(){

		remove.add("chetan");
		remove.add("pandurang");
		remove.add("chetan");
		remove.add("sujata");
		remove.add("Bye");
		System.out.println("Displaying Linked List");
		System.out.println(remove);
	}
	
	public void remove1(){
		remove.remove(0);
		System.out.println("Displaying Linked List after removing");
		System.out.println(remove);
	}

}
