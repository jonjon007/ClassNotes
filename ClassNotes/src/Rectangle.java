
public class Rectangle {
	private int Width;
	private int Length;
	private int NbrOfRec = 0;
	//The constructor is a method of constuctor type.
	//"No R" constructor
	//Make a private constructor to prevent automatic instantiation.
	//Math has a private constructor
	private Rectangle(){
		NbrOfRec++;
	}
	public Rectangle(int width){
		this();
		Width = width;
	}
	public Rectangle(int width, int length) {
		//super();
		this(width);
		//Width = width;
		Length = length;
	}
	public int getWidth() {
		return Width;
	}
	public void setWidth(int width) {
		Width = width;
	}
	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		Length = length;
	}
	public int area(){
		return Width * Length;
	}
	public int perimeter(){
		return 2*(Width + Length);
	}
}
