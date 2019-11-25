import java.io.*;
class fileios{
	public static void main(String[] args) throws Exception {
		try{
			FileInputStream fis= new FileInputStream("file.txt");
			int i;
			while((i=fis.read())!=-1){
			System.out.println((char)i);
			} 
			fis.close();
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}