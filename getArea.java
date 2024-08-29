package labpractice;
import java.util.*;
class getAreA {
      public void getarea() {
    	  int l,b,area;
    	  area=l*b;
    	  System.out.println(area);
      }
}
class rectangle extends getAreA{
	public void getarea() {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int area=a*b;
	System.out.println(area);
	}
}
public class getArea{
	public static void main(String args[])
	{
	   rectangle r1=new rectangle();
	   r1.getarea();
	}
}	
		


