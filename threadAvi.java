import java.util.*;

class even extends Thread {
	public void run(){
		for(int i=0;i<6;i++){
			if(i%2==0){
				System.out.println(i+" is even");
			}
		}
	}
}

class odd extends Thread {
	public void run(){
		for(int i=0;i<6;i++){
			if(i%2!=0){
				System.out.println(i+" is odd");
			}
		}
	}
}

class Main {
	
	public static void main(String[] args) {
		
	even objEven = new even();
	odd objOdd = new odd();
	objEven.start();
	objOdd.start();
	}
}

