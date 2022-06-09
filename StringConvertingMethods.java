package com.cashapona.Refferences.jun7;
class Teja{
 public void stringToCharacter() {
String str="vallepu venkata teja";
for(int i=0;i<str.length();i++) {
char ch=str.charAt(i);

System.out.println(ch);
}
}
       public void stringToCharcterArray() {
    	String str="vallepu Ramanaiah garu";
    		char[]c=str.toCharArray();
             for(char ch:c)
    		System.out.println(ch);	
    	}
	public void count() {
		String str="Devatapati anusha";
		for(int i=0;i<str.length();i++) {
			System.out.println(i);	
		}	
	}

	public void reverseTheString() {
		String str="Devatapati anusha";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}	
	}
}
public class StringConvertingMethods {
	public static void main(String[]args){
	Teja t= new Teja();
	t.stringToCharacter();
	t.stringToCharcterArray();
	t.count();
	t.reverseTheString();
	}	
}

