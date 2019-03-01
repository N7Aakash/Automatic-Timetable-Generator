import java.util.ArrayList;

public class Test{


	Test(){
		// String a = "";
		ArrayList<String> a = new ArrayList<>();
		changeString(a);
		System.out.println(a.get(0));
	}

	// String str = "";

	public void changeString(ArrayList<String> a){
		a.add("added!");;
	}

	public static void main(String args[]){
		Test t = new Test();
		// System.out.println(t.str);
		// t.changeString

	}
}	