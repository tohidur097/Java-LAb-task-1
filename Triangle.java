public class Triangle{
	private int x;
	private int y;
	private int z;
	
	
	public  Triangle(){
		System.out.println("Empty constructor");
		System.out.println("Empty valued");
	}
	public void Triangle(int x,int y,int z){
		setX(x);
		setY(y);
		setZ(z);
	}	

	public void setX(int x){
		if (x>=1){
			this.x=x;
		}
		else {
			System.out.println("invalid one side ");
		}
		
	}

	public int getX(){
		return x;
	}


	public void setY(int y){
	if (y>=1){
		   this.y=y;
		}
	   else {
		System.out.println("invalid one side ");
		}
	}

	public int getY(){
		return y;
	}
	public void setZ(int z){
		if (z>=1){
			this.z=z;
		}
		else{
			System.out.println("invalid one side ");
		}
	}

	public int getZ(){
		return z;
	}
	public void testTriangle(){
		if(x==y && y==z){
			System.out.println("triangle is equilateral");
		}
		else if (x==y || y==z){
			System.out.println("triangle is isosceles");
		}
		else{ 
			System.out.println("triangle is scalene");
		}
	}	
	
	public void showInfo(){
		System.out.println("value of x:" +x);
		System.out.println("value of y:" +y);
		System.out.println("value of z:" +z);
	}
	
}