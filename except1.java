class demo{
	public static void main(String[] args) {
		try{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(Exception e){
			System.out.print("arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print("array IndexOutOfBoundsException");
		}
		catch(ArithmeticException e){
			System.out.print("other Error");
		}
	}
}