package com.cashapona.Refferences.jun7;
public class StringBufferMethodsRunner {
	/**
	 * 
	 */
	public static void main(String[] args) {
		/*StringBuffer is mutable  or changable , Once we create string object that can be modified in same memory location
		* StringBuffer object can be created only with constructor
		* creates empty StringBuffer object and display
		*/
		StringBuffer stringBuffer=new StringBuffer();                                     
		System.out.println("Creates empty stringbuffer obj  "+stringBuffer);
		/*
		 * capacity(), return the current capacity
		 * default capacity of  StringBuffer is 16
		 */
		System.out.println("Capacity() stringbuffer obj : "+stringBuffer.capacity());      
		/*
		 * creates emptystring buffer obj with the given capacity				
		 */
		StringBuffer sb=new StringBuffer(4);                                   
		System.out.println("creates empty stringbuffer with the given capacity : "+sb.capacity());
		/*
		 * create stringBuffer object sb1 using new operator
		 */
		StringBuffer sb1=new StringBuffer("teja");
		System.out.println("original string : "+sb1);
		//print 19 , default size(16)+3=19
		System.out.println("capacity of the original string : "+sb1.capacity());   
		/*
		 * create stringbuffer obj by passing null value, leads to NullPointerException
		 */
		try
		{
			StringBuffer ss2=new StringBuffer(null);             
			System.out.println(ss2);
		}
		catch(NullPointerException e)
		{					
			System.out.println(e);
		}
		/*
		 *  Comparision of s1==s2 (Reference comparision only) and s1.equals(s2) in StringBuffer
		 */
		StringBuffer s1=new StringBuffer("teja");
		StringBuffer s2=new StringBuffer("teja");
		System.out.println(" StringBuffer teja==teja returns : "+(s1==s2));
		/*
		 * equals() method meant for reference/address comparision. references of both pointing to different so returns false
		 * In StringBuffer equals() method is not overriden
		 */
		System.out.println("In StringBuffer , equals() method is for reference of two strings : "+s1.equals(s2));
		/*
		 * length()   ,StringBuffer  default capacity is 16
		 */
		StringBuffer sb2=new StringBuffer("venkatteja");
		System.out.println("Length() StringBuffer :  "+sb2.length());       
		/*
		 * charAt(index), return the character at the specified position.
		 */
		System.out.println("charAt(2nd posi) of anu is :  "+s1.charAt(2));   
		/*
		 * setChatAt(index,char) , modify character at particular index posi
		 */
		sb1.setCharAt(0,'t');             
		System.out.println("StringBuffer : "+sb1);           
		System.out.println("setChatAt(0 posi,t char) : "+sb1);           
		/*
		 * append() , can add string/float/int /boolean values
		 */
		System.out.println("StringBuffer : "+sb2);           
		System.out.println("append() with 1.12 : "+sb2.append(1));
		/*
		 * insert(posi,string) , insert string at particular posi
		 */
		System.out.println("insert(1,prasad) to venkatateja : "+sb2.insert(1,"prasad"));
		/*
		 * delete(int startIndex, int endIndex), delete from strating index to end-1 index
		 */
		StringBuffer sb4=new StringBuffer("venkat");
		System.out.println("StringBuffer : "+sb4);           
		System.out.println("delete(2,4)  : "+sb4.delete(2,4));
		/*
		 * reverse(), used to reverse the string.
		 */
		System.out.println("reverse() of teja	: "+s1.reverse());
	}
}

