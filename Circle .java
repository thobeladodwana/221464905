package za.ac.wsu.s221464905;
/*Athor Thobela Dodwana
 * Date created 22/04/2022
 * calculating circle Area, Circumference, Diameter
 */
	public class Circle{

	  private float radius;
	  private int x;
	  private int y;

	public Circle(float radius,int x,int y){

	this.x=x;
	this.y=y;
	this.radius=radius;

	}
	public void setX(int x){
	   this.x=x;
	}

	public void setY(int y){
	   this.y=y;
	}

	public void setRadius(float radius){
		//radius should not be less than zero
	  if(radius>0) {
	   this.radius=radius;
	  }
	  else {
		  System.out.println("Radius is must be positive ");
	  }
	}
	public float getRadius(){
	    return radius;
	}

	public int getX(){
	   return x;
	}

	public int getY(){
	    return y;
	}

	void calculateArea(){
		   System.out.println("X is : "+getX());
		   System.out.println("Y is : "+getY());
		   System.out.println("Radius is: "+getRadius());
		  
	   System.out.println("Area : "+Math.PI*(getRadius()*getRadius()));
	  
	}

	void calculateCircumference(){

	  System.out.println("Circumference : "+2*Math.PI*radius);

	}


	void calculateDiameter(){

	 System.out.println("Diameter : "+2*+getRadius());

	 }
}
