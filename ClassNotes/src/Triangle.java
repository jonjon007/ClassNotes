
public class Triangle implements Comparable{
	private int sideA;
	private int sideB;
	private int sideC;
	
	public Triangle(int sideA, int sideB, int sideC)  {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public int getSideA() {
		return sideA;
	}
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}
	public int getSideB()throws Exception/*Works automatically w/ or w/out. Can state specific exception here.*/ {
		return sideB;
	}
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	public int getSideC() {
		return sideC;
	}
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	
	public int Perimeter(){
		return sideA + sideB + sideC;
	}
	
	public double HalfPerimeter(){
		return Perimeter()/2;
	}
	
	
	public double Area(){
		double area = 0;
		try{
			area = Math.sqrt(HalfPerimeter()*(HalfPerimeter()));
			if(Double.isNaN(area)){
				throw new TriangleException(this);
			}
		}
		catch(TriangleException e){
			throw e;
		}
		catch (Exception e){
			throw e;
		}
		return area;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		int iReturnCompare = 0;
		Triangle t = (Triangle)(arg0);
		iReturnCompare = Double.compare(this.Perimeter(), t.Perimeter());
		return iReturnCompare;
	}
}
