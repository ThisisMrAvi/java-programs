class Test {
	public static void main(String[] args) {
		System.out.println(fun());
	}
	 int fun(){
	    static int x=0;
		return ++x;
	}
}