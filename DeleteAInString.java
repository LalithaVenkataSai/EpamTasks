package com.epam.tddjunittask;

public class DeleteAInString {
	
	public String del(String st) {
		String result=st;
		if(st.length()>=2) {
		if(st.charAt(0)=='A' && st.charAt(1)=='A')
			return st.substring(2);
		else if(st.charAt(0)=='A')
			return "" + st.substring(1);
		else if(st.charAt(1)=='A')
			return ""+st.charAt(0) + st.substring(2);
		}
		else if(st.length()==1) {
			if(st.charAt(0)=='A')
				result="";
		}
		return result;
	}
}
