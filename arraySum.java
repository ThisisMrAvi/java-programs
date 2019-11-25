import java.util.*;
class arraySum {
	public static void main(String[] args) {
		int a[]=new int [10];
		int sum=0;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter :");
		for (int i=0; i<10;i++){
			a[i]=obj.nextInt();
		} 
		for (int i:a){
			sum =sum + i;
		}		
		System.out.println(sum);
	}
}