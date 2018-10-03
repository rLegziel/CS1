



public class Rectangle
{
	private int height;
	private int width;
	
	
/*
	default constructor that takes no parameters and creates a rectangle of height 10 and width 5
	*/
	public Rectangle(){ // constructor that takes no parameters and creates a default 5x10 rectangle
		height = 10;
		width = 5;
	}
	
	/*
	Rectangle constructor that takes in two parameters- and creates an object accordingly
	*/
	
	public Rectangle(int mHeight,int mWidth){ 
		height = mHeight;
		width = mWidth;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setHeight(int newHeight){
		height = newHeight;
	}
	
	public void setWidth(int newWidth){
		width = newWidth;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getArea(){
		int area = height*width;
		return area;
	}
	
	public static void main ( String[] args){
		Rectangle defRectangle = new Rectangle();
		Rectangle customRectangle = new Rectangle(2,2);
		
		System.out.println(defRectangle.getHeight());
		System.out.println(defRectangle.getWidth());
		System.out.println(defRectangle.getArea());
	}
}
		