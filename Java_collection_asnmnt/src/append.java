import java.util.*;
public class append {

	ArrayList<String> appendArray;
	
	public append(){
		appendArray=new ArrayList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		append a=new append();
		a.append();
	}
	
	public void append(){

		appendArray.add("chetan");
		System.out.println(appendArray);
		appendArray.add("pandurang");
		System.out.println(appendArray);
		appendArray.add("revankar");
		System.out.println(appendArray);
		appendArray.add("sujata");
		System.out.println(appendArray);
		appendArray.add("pooja");
		System.out.println(appendArray);
	}

}
