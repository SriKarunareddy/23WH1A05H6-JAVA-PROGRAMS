package labpractice;

class computer1 {
    class processor{
    	 void displaydetails(){
    		  System.out.println("processor brand:brand1\nprocessor speed:so and so speed");
    	}
    	 
    }
}
 public class  computer{
    	public static void main(String args[]) {
    		computer1 myout=new computer1();
    		computer1.processor myin= myout.new processor();
    		myin.displaydetails();
    		
    		
    	}
 }

    

