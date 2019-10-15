import java.util.*;
public class compare {
	
	ArrayList<String> AL1;
	ArrayList<String> AL2;
	
	public compare(){
		AL1=new ArrayList<>();
		AL2=new ArrayList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare c=new compare();
		c.add();
		c.compare1();
	}
	
	public void add(){
		AL1.add("chetan");
		AL1.add("pandurang");
		AL1.add("revankar");
		AL1.add("sujata");
		AL1.add("pooja");
		System.out.println(AL1);
		
		AL2.add("abcd");
		AL2.add("pandurang");
		AL2.add("revankar");
		AL2.add("sujata");
		AL2.add("pooja");
		System.out.println(AL2);
	}
	
	public void compare1(){
		Boolean com=AL1.equals(AL2);
		if(com==true)
			System.out.println("Array lists are equal");
		else
			System.out.println("Array lists are not equal");
	}
}
