package labpractice;

public class dog {
    String name,colour;
    public dog(String n,String c){
                name=n;
               	colour=c;
    }
    public static void main(String args[]) {
    	dog myobj=new dog("bhairava","brown");
    	
    	System.out.println(myobj.name);
    	System.out.println(myobj.colour);
    	
    }
    
}
