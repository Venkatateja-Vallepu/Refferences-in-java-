package com.cashapona.Refferences.jun7;

public class AutoBoxingWrapperClassesRunner {
	/* create AutoBoxingWrapperClassesRunner class for converting primitives into objects
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			/*
			 * creation primitives and assigning values
			 */
			byte b=10;  
			short s=20;  
			int i=30;  
			long l=40;  
			float f=50.01F;  
			double d=60.03D;  
			char c='a';  
			boolean b2=true;  
			/*
			 * creation of wrapper class objects assigned to primitives
			 */
			Byte byteobj=b;  
			Short shortobj=s;  
			Integer intobj=i;  
			Long longobj=l;  
			Float floatobj=f;  
			Double doubleobj=d;  
			Character charobj=c;  
			Boolean boolobj=b2; 
			/*
			 * printing object values
			 */
			System.out.println("Byte object: "+byteobj);  
			System.out.println("Short object: "+shortobj);  
			System.out.println("Integer object: "+intobj);  
			System.out.println("Long object: "+longobj);  
			System.out.println("Float object: "+floatobj);  
			System.out.println("Double object: "+doubleobj);  
			System.out.println("Character object: "+charobj);  
			System.out.println("Boolean object: "+boolobj);  
		}
	}
