import java.io.*;
class ThrowExample {
	void mymethod(int num) throws IOException, ClassNotFoundException{
		if(num==1) throw new IOException("IOException occured");
		
		else
		throw new ClassNotFoundException("ClassNotFoundException occured");
		}
}
public class Example7{
	public static void main(String[] args) {
		try{
			ThrowExample obj = new ThrowExample();
			obj.mymethod(0);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}