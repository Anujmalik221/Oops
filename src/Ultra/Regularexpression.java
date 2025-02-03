package Ultra;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpression {
	
	
	  public static void main(String[] args) {
		  
		  Pattern pat = Pattern.compile("AlphaGamma", Pattern.CASE_INSENSITIVE );
		  Matcher pt = pat.matcher("6alphagamma");
		  
		  boolean matchFound = pt.find();
		  
		  if(matchFound) {
			  
			  System.out.println("Match Found");
		  }
		  else 
			  System.out.println("Match not Found");
		  {
			  
		  }
			  
		  }
		  
		  
}
	  

