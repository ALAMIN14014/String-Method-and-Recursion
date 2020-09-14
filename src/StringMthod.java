
public class StringMthod {

	public static void main(String[] args) {

		String str= "ALAmin";
		String str1= "EraInfoTech";
		String str2= "alamin";
		
		
		
		char ch=str.charAt(2);// return the index value of the given string
		System.out.println("charAt Method: The value of index 2 is "+ ch);
		
		int x= str.compareTo(str1);// -4 output as 2nd string lexicographically 4 times less
		System.out.println("CompareTo Method: Use of String CompareTo method "+x); // always compare first string which is not matched
		
		String s=str.concat(str1);// it adds another string at the end of the first string
		System.out.println("Concat Method: After string concat: "+s);
		
		System.out.println("Contains Method: "+str1.contains("Era"));// contains method search the sequence of character
		

		System.out.println("Endwith Method: "+str1.endsWith("tech"));// it checks string ends with the given suffix
		

		System.out.println("Equal Method: "+str1.equals(str));// compare 2 string case sensitive
		
		System.out.println("equalsIgnoreCase Method: "+str.equalsIgnoreCase(str2));// compare 2 string not case sensitive
		
		String sf1= String.format("Name is %s", str);
		
		System.out.println("Format Method: "+ str); // string format method use
		
		int index=str1.indexOf("Tech"); //return the index of substring
		System.out.println("indexof method: substring index "+index);
		
		String s1=str.toLowerCase();//return the index in lowercase letter
		System.out.println("tolowercase method: "+ s1); 
		
		String s2=str.toUpperCase();//return the index in uppercase letter
		System.out.println("tolowercase method: "+ s2); 
		
		String substr2 = str1.substring(0,3);
		System.out.println("tolowercase method: "+ substr2); //retunr substring
		
		System.out.println("string length is: "+str.length());//retunr the length of the string
		
		System.out.println("StartsWith method: " + str.startsWith("ALA")); //check the string start with given prefix
		
		
		int result = str.codePointAt(1);// return the unicde of the string
		System.out.println("CodepointAt method: "+result);
		
		result = str.codePointCount(0, 3);
		System.out.println("CoderpointCount Method: "+result); //retunr the number of unicode
		
		
		System.out.println("trim method: "+str.trim());//remove the white space
		
		System.out.println("replace method: "+str.replace('A', 'l'));//all A character will replace the character l
		
		
		
		 
		
	}

}
