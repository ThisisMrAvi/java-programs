import java.util.*;
class stdDetails{
	int RegNo;
	int Marks[]=new int[3];
	float total=0;
	String name;
	Scanner o= new Scanner(System.in);
	void getdata(){
		System.out.println("Enter student RegNo:");
		RegNo= o.nextInt();
		System.out.println("Enter student name:");
		name= o.next();
		System.out.println("Enter student Marks in array:");
		for(int i =0; i<3;i++){
			Marks[i]=o.nextInt();
		}
	}

	void show(){
		for(int i =0; i<3;i++){
			total+=Marks[i];
		}
		System.out.println("Student RegNo: "+RegNo);
		System.out.println("Student Name: "+name);
		System.out.println("Student total marks :"+total);
	}
}
class StdClass extends stdDetails{
	public static void main(String[] args) {
	stdDetails s1=new stdDetails();
	stdDetails s2=new stdDetails();
	stdDetails s3=new stdDetails();
	stdDetails s4=new stdDetails();
	stdDetails s5=new stdDetails();
	s1.getdata();
	s1.show();
	s2.getdata();
	s2.show();
	s3.getdata();
	s3.show();
	s4.getdata();
	s4.show();
	s5.getdata();
	s5.show();
	
	}
}