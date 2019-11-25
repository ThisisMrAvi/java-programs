import java.io.*;	
class B3{
	public static void main(String[] args) throws IOException {
		String str;
		BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
		do{
			str=(char)obj.readLine();
			System.out.println(str);
		}
		while(!str.equals("strong"));
	}
}