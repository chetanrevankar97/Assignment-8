import java.util.*;
public class shuffle {

	ArrayList<String> shuffleArray;
	public shuffle(){
		shuffleArray=new ArrayList<>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shuffle s=new shuffle();
		s.add();
		s.shuffle1();
	}
	
	public void add(){

		shuffleArray.add("chetan");
		shuffleArray.add("pandurang");
		shuffleArray.add("revankar");
		shuffleArray.add("sujata");
		shuffleArray.add("pooja");
		System.out.println(shuffleArray);
	}
	
	public void shuffle1(){
		Collections.shuffle(shuffleArray);
		System.out.println(shuffleArray);
	}

}
