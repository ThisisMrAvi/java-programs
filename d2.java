import java.io.*;
class d2{
	public static void main(String[] args) throws Exception {
		try{
			File f=new File("file.txt");
			FileOutputStream fos= new FileOutputStream("avi.txt");
			FileInputStream fis= new FileInputStream("file.txt");
			if(f.exists()){
				System.out.println("File found");
			}
			else{
				System.out.println("File not found");

			}
			int i;
			while((i=fis.read())!=-1){
				fos.write(i);
			} 
			fis.close();
			fos.close();
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}