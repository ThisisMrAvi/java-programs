class VoteError extends Exception {
	/*
    public String toString(){
    	return "Age is can not be less than 18";
    }
	*/
}
class userExcept{
	public static void main(String args[]) {
	    try{
	    	int age=3;
	        if(age<18){
	        	throw new VoteError();
        	}
        	else{
          		System.out.println("Welcome to vote");
        	}
	    } 
	    catch(VoteError e){
	        System.out.println("Age cant be less than 18");
	    }
		System.out.println("Testing Complete");
	}
}