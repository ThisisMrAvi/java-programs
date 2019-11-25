import java.util.regex.*;
import java.util.*;

class Test {
	
	public static void main(String[] args) {
		
		/*Pattern p=Pattern.compile("\\d+");
		Matcher m= p.matcher("12+35");
		System.out.println(m);
		while(m.find()){
			System.out.println(m.group());
		}
		*/
		int op=0;
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(95);
		arr.add(45);
		for(int i:arr){
			op=op-i;	
		}
		System.out.println(op);
	}
	
}

