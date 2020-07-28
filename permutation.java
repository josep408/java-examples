package week15;
 
public class StringPermutation {
	   public static void displayPermutation(String s) {

	       displayPermutation("", s);

	   }

	public static void displayPermutation(String s1, String s2) {

	   if (s2.length() <= 0) {

	           System.out.println(s1);

	           return;

	       }

	      

	   StringBuilder str1;

	   String str2;

	      

	   for (int i = 0; i < s2.length(); i++) {

	       str1 = new StringBuilder(s1);

	           str1.append(s2.charAt(i));

	           str2 = s2.substring(0, i) + s2.substring(i+1, s2.length());

	           displayPermutation(str1.toString(), str2);

	       }

	}

	   public static void main(String[] args) {

	       displayPermutation("abc");

	   }

	}

//abc
//acb
//bac
//bca
//cab
//cba
