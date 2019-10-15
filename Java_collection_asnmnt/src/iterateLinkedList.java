import java.util.*;

public class iterateLinkedList {
	
	LinkedList<String> iterate;
	
	public iterateLinkedList(){
		iterate=new LinkedList<>();
	}
	
	public static void main(String[] args){
		
		iterateLinkedList i=new iterateLinkedList();
		i.add();
		i.iterate1();
	}
	
	public void add(){

		iterate.add("chetan");
		iterate.add("pandurang");
		iterate.add("revankar");
		iterate.add("sujata");
		iterate.add("pooja");
		System.out.println(iterate);
	}
	
	public void iterate1(){
		int iter;
		int n=iterate.size();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter index to iterate");
		iter=sc.nextInt();
		for(int i=iter;i<n;i++){
			System.out.println(iterate.get(i));
		}
	}
}
