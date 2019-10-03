
public class ColorRectangle extends Rectangle1 implements Colored {
	public String color;
	
	/*Create a new constructor due to the constructor from parent class is implicit, 
	use keyword super to invoke the parameters from parent class.*/
	public ColorRectangle(int x,int y,String color) {
		super(x,y);
		this.color=color;
	}
	
	public String getColored() {
		return color;
	}
	
	//Use equal method to compare the objects.
	public boolean equals(Object o) {
		if(o instanceof ColorRectangle) {
			ColorRectangle other=(ColorRectangle)o;
			return height==other.height&&width==other.width;
		}
		else {
			return false;
		}
	}
	
	//Use keyword super to invoke the toString method from parent class;
	public String toString() {
		return super.toString()+" "+getColored();
	}
}
