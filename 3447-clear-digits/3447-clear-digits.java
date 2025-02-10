class Solution {
    public String clearDigits(String a) {
        Stack<String> str=new Stack<>();
		for ( int i=0;i<a.length();i++){
		  str.push(a.charAt(i)+"");
		    if(a.charAt(i)=='0'||a.charAt(i)=='1'||a.charAt(i)=='2'||a.charAt(i)=='3'||a.charAt(i)=='4'||a.charAt(i)=='5'
		    ||a.charAt(i)=='6'||a.charAt(i)=='7'||a.charAt(i)=='8'||a.charAt(i)=='9')
		    {str.pop();
		    if(str.size()>0){
		        str.pop();
		    }
		    
		        
		   
		    
		}
		
	}
    StringBuilder sb = new StringBuilder();
     for (String item : str) {
            sb.append(item);  // Append each item with a space
        }
    return sb.toString();
    }
}