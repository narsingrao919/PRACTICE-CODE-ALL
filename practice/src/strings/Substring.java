package strings;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="code";
		
		     for(int i=0;i<str.length();i++) {
		    	 for(int j=i+1;j<=str.length();j++) {
		    		 System.out.print(str.substring(i, j)+",");
	        }
	    }
		     
	

	}
}


