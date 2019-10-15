import java.util.*;
public class firstLast {
	
	LinkedList<String> fl;
	
	public firstLast(){
		fl=new LinkedList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstLast f=new firstLast();
		f.add();
		f.firstlast();
	}
	
	public void add(){

		fl.add("chetan");
		fl.add("pandurang");
		fl.add("chetan");
		fl.add("sujata");
		fl.add("chetan");
		System.out.println(fl);
	}

	public void firstlast(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to check occurence");
		String occ=sc.next();
		int n=fl.size();
		for(int i=0;i<n;i++){
			if(occ.compareTo(fl.get(i))==0){
				System.out.println("First occurence at index:"+i);
				break;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(occ.compareTo(fl.get(i))==0){
				System.out.println("Last occurence at index:"+i);
				break;
			}
		}
	}

}
