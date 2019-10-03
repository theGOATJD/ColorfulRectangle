
public class Rectangle1 {
	//Declared variables;
	public int height;
	public int width;
	
	//Created a constructor;
	public Rectangle1(int x,int y) {
		this.height=y;
		this.width=x;
	}
	
	//getHeight method;
	public int getHeight() {
		return height;
	}
	
	//getWidth method;
	public int getWidth() {
		return width;
	}
	
	//Use toString method to print out the value;
	public String toString() {
		return "Rectangle["+height+","+width+"]";
	}
}
