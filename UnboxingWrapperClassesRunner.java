package com.cashapona.Refferences.jun7;

public class UnboxingWrapperClassesRunner {
	 //create UnboxingWrapperClassesRunner for converting objects into primitives
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			/*
			 * created objects for wrapper classes and assigned values
			 */
			Byte byteobj=12;  
			Short shortobj=10;  
			Integer intobj=1234;  
			Long longobj=12345l;  
			Float floatobj=1.34f;  
			Double doubleobj=1.09d;  
			Character charobj='c';  
			Boolean boolobj=true; 
			/*
			 * converting objects into primitives
			 */
			byte bytevalue=byteobj;  
			short shortvalue=shortobj;  
			int intvalue=intobj;  
			long longvalue=longobj;  
			float floatvalue=floatobj;  
			double doublevalue=doubleobj;  
			char charvalue=charobj;  
			boolean boolvalue=boolobj;  
			/*
			 * display primitives
			 */
			System.out.println("byte value: "+bytevalue);  
			System.out.println("short value: "+shortvalue);  
			System.out.println("int value: "+intvalue);  
			System.out.println("long value: "+longvalue);  
			System.out.println("float value: "+floatvalue);  
			System.out.println("double value: "+doublevalue);  
			System.out.println("char value: "+charvalue);  
			System.out.println("boolean value: "+boolvalue);  
		}
	}


