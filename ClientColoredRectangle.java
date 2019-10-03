import java.util.ArrayList;

public class ClientColoredRectangle {

	public static void main(String[] args) {
		//Created new objects;
		ColorRectangle r1=new ColorRectangle(7,8,"red");
		ColorRectangle r2=new ColorRectangle(5,4,"blue");
		ColorRectangle r3=new ColorRectangle(6,9,"green");
		
		//Print out;
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		
		//Created an ArrayList to store the objects;
		ArrayList<ColorRectangle> cl=new ArrayList<ColorRectangle>();
		cl.add(r1);
		cl.add(r2);
		cl.add(r3);
	 
		//Compared three objects;
		System.out.println(r1.equals(r2));	
		System.out.println(r1.equals(r3));
		System.out.println(r2.equals(r3));
	}
	 
	
	 
	

} 


