package programs;

public class palyndrom {
 public static void main(String[] args) {
	 int x =434,sum=0,y,a;
	 y=x;
	 while(y!=0){
		 a=y%10;
		 sum= sum+a*10;
		 y=y/10;
		 
	 }
	 if(sum==x) {
		 System.out.println("it is apolyndrome...!");
	 }
	 else {
		 System.out.println("it is a polyndrome");
	 }
 }
}
