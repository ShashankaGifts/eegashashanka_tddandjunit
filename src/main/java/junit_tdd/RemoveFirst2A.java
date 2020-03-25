package junit_tdd;

public class RemoveFirst2A {
	public String remove(String string) {
		String res = string;
		if(string.length()<=0)
			res = "";
		else{
			if(string.charAt(0) == 'A' && string.charAt(1) == 'A'){
				res= string.substring(2,string.length());
			}
			else if(string.charAt(0) == 'A' || string.charAt(1) == 'A'){
				if(string.charAt(0) == 'A' )
					res = string.substring(1,string.length());
				else
					res = string.charAt(0)+string.substring(2, string.length());
			}
		}
		return res;
	}


}
