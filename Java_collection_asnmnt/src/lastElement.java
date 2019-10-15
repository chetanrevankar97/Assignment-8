import java.util.*;
public class lastElement {
	
	LinkedList<String> last;
	
	public lastElement(){
		last=new LinkedList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lastElement l=new lastElement();
		l.add();
		l.last1();
		
	}
	
	public void add(){

		last.add("chetan");
		last.add("pandurang");
		last.add("chetan");
		last.add("sujata");
		last.add("Bye");
		System.out.println(last);
	}
	
	public void last1(){
		int n=last.size();
		System.out.println("Last element is: "+(last.get(n-1)));
	}
}
