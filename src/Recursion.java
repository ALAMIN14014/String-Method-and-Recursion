

public class Recursion {
	
  public static void main(String[] args) {

	  int res = sum(5);
	  
    System.out.println(res);
  
  }
  
  public static int sum(int x) {
  
	  if (x > 0)
	  {
		  
      return x + sum(x - 1);
    
	  } 
	  else {
		  
      return 0;
  
	  }

  }

}