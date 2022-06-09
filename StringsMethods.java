package com.cashapona.Refferences.jun7;
	class StringCompare {
		// create two Strings :
		String str1 = new String("JavainSimplyway");
		String str2 = new String("JAVAINSIMPLYWAY");
		String str3 = new String("jbkjsuwfsnbcksb");

		/*
		 * 4 ways to do String comparison or equality: 1.By using == Operator. 2.By
		 * using equals() method 3.By using equalsIgnoreCase() 4.By using compareTO()
		 * method
		 */
		// 1.By Using "==" Operator:
		// this operator is compare the only object references not object content:
		public void visible() {
			boolean b = str1 == str2;
			System.out.println("Visible to comparison of two String:" + b);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}

		/*
		 * 2.By Using equals() method: this method is compare to the object content
		 * character by character then its returns the boolean values (true/false):
		 */
		public void display() {
			boolean obj = str1.equals(str2);
			System.out.println("compare to two Strings:" + obj);
			System.out.println("..........................");
		}

		/*
		 * 3.equlasIgnoreCase(): this is compare to the object content of the ignore the
		 * character is upper or lower.then content is same is boolean values are return
		 * (true/false).
		 */
		public void ignoreCase() {
			boolean ignoreCase = str1.equalsIgnoreCase(str2);
			System.out.println("this method is compare to the two Strings:" + ignoreCase);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		}

		/*
		 * 4.compareTo() method this method is compare the object content of characters
		 * but instead returning the boolean output.it return the integer vaule equal or
		 * not.
		 */
		public void compareTO() {
			int n1 = str1.compareTo(str2);
			int n2 = str2.compareTo(str3);
			System.out.println("comparing two Strings:" + n1);
			System.out.println("comparing the Strings:" + n2);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");

		}
	}

	// create a class for StringConcatenation:
	class StringConcatenation {
		String c1 = "learing " + "Java";
		String c2 = new String("Join " + "Cashapona");

		public void pulseCancat() {
			System.out.println("Adding the two String values==" + c1 + "_______________" + c2);

		}

		String m1 = "vemkat ";
		String m2 = "teja";
		String m3 = "vallepu";

		public void concatMethod() {
			String m = m1.concat(m2).concat(m3 + "");
			System.out.println("Adding the two String literals:" + m);
		}

		// String Builder Concept:
		/*
		 * String Builder is using to concatenating more number or large number of
		 * String objects can combined.append() method is used.
		 * 
		 * prefer this way when we concatenating large number of Strings objects in a
		 * "Single threaded applications." don't use it in multithreaded applications,
		 * and when we need to append inside the loop ,avoid the object inside the loop
		 * . but append method is creating the inside the loop and by creating the
		 * object outside the loop.
		 */
		// creating String literals:
		String p1 = "WelCome ";
		String p2 = "To ";
		String p3 = "Cashapona ";
		String p4 = "venktateja";

		public void appendBuilder() {
			// creating a StringBulider object:
			StringBuilder sb = new StringBuilder();
			// using the append() method:
			sb.append(p1).append(p2).append(p3).append(p4);
			System.out.println("combined the String literals: " + sb);
		}

		// StringBuffer Concept:
		/*
		 * StringBuffer is mutable.StringBuffer is used append() method. this append()
		 * is used to adding or concatenating one more String Objects. 1.
		 * 
		 * StringBuffer is supported by only multithreaded applications only.2. don't
		 * support single threaded applications.3.append () apply inside the loop but
		 * object is creating outside the loop.
		 */
		// creating String literals:
		String b1 = "Iam ";
		String b2 = "going to ";
		String b3 = "Hyderabad ";
		String b4 = "Tomorrow.";

		// creating a method:
		public void appendBuffer() {
			// Create the StringBuffer Object:
			StringBuffer bf = new StringBuffer();
			// using the append() method:
			bf.append(b1).append(b2).append(b3).append(b4);
			System.out.println("comband the String literals:" + bf);

		}
	}

	// creating the class LowerCaseConversion:
	/*
	 * This is the purpose of converting upper case characters to lower case
	 * characters:
	 */
	class LowerCaseConversion {
		String l1 = new String("CASHAPONA IS SOFTWARE COMPANY .IT IS THE ONE OF THE LEADING COMPANY");
	}		
	public class StringsMethods {

		String s1 = "java is a powerful language";
		// create a Second String:
		String s2 = "in a Software industry.";
		String s3 = " javaScript";
		//changing old character to new character by using the replace(): /
		String replace = s3.replace('j', 'h');
	// join to two Strings by using the concat() method:
		String add = s1.concat(s2);
	// find the length of the String by using length method:
		int length = add.length();
	// compare to Strings After to get boolean values:
		boolean compare = s2.equals(add);
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Creating a object of String:
		    StringsMethods all = new StringsMethods();{
			// print the Statements:
			System.out.println("First String: " + all.s1);
			System.out.println("Length of the String is:" + all.length);
			System.out.println("Joining the two String After the get Single String:" + all.add);
			System.out.println("Compare to String after to get boolean values:" + all.compare);
			System.out.println("String present or not get boolean values :" + all.s3.contains("javaScript"));
			System.out.println("old String is repalce to new String:" + all.s3.replace('j', 'h'));
			System.out.println("New String " + all.replace);
			// creating a of that Class object:
			StringCompare compare = new StringCompare();
			compare.display();
			compare.visible();
			compare.ignoreCase();
			compare.compareTO();
			// creating the object of StringConcatenation class:
			StringConcatenation concat = new StringConcatenation();
			concat.pulseCancat();
			concat.concatMethod();
			concat.appendBuilder();
			concat.appendBuffer();
		    }
		}
	}
	
	


	

