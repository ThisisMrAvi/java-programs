import java.io.*;
import java.util.*;
abstract class AddressBook{
	int house_no, post_code;
    String town,street_name,country;
	abstract void input();
	abstract void display();
}
class AddressName extends AddressBook {
    void input() {
	    try{
	    	Scanner in= new Scanner(System.in);
	    	System.out.print("Enter house no: ");
	    	house_no= in.nextInt();
	    	System.out.print("Enter Street: ");
	    	street_name= in.next();
	    	System.out.print("Enter town: ");
	    	town= in.next();
	    	System.out.print("Enter country: ");
	    	country= in.next();
	    	System.out.print("Enter post_code: ");
	    	post_code= in.nextInt();
	    }
	    catch(Exception e){
	    	System.ot.println("Error Occured");
	    }
    }

    void display(){
    	System.out.print("Address: "+house_no+", "+street_name+", "+town+", "+ country+", "+post_code);
    }
}

