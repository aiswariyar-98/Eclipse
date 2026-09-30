package Stringclass;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string length
		String a = "India";
		System.out.println(a.length());//returns int values
		//char at
		char a1=a.charAt(3);
		System.out.println(a1);
		//compare to it is case sensitive
		String b = "india";
		String c = "Australia";
		String d = "America";
		String e = "India";
		System.out.println(a.compareTo(b)); //case sensitive
		System.out.println(a.compareTo(e)); //both are same
		System.out.println(a.compareTo(c)); //string1 is big
		System.out.println(c.compareTo(d)); //2nd letter
		System.out.println(c.compareTo(a)); //string2 is big
		
		//concat
		String n1 = "Aiswariya";
		String n2 = "Warrior";
		n1.concat(n2);
		System.out.println(n1); //dont work
		System.out.println(n1.concat(n2)); //works
		
		//contains
		String s="India is my country";
		System.out.println(s.contains("my country"));
		System.out.println(s.contains("another country"));
		
		//startswith
		System.out.println(s.startsWith("india")); //case sensitive
		
		//endswith
		System.out.println(s.endsWith("country")); //case sensitive
		
		//substring
		System.out.println(n2.substring(2));
		System.out.println(n2.substring(2, 4));
		
		//replace
		System.out.println(s.replace('a','i'));
		System.out.println(s.replace("my", "our"));
		
		//trim
		String j = "hello java";
		System.out.println(j.trim()+" java programming");
		
		//equals
		String d5 = new String("America");
		System.out.println(d.equals(d5)); //length and case
		
		//equalsIgnoreCase
		System.out.println(a.equalsIgnoreCase(b)); //only length
		
		//toLowerCase
		//toUpper
		String u = "AMERICA";
		String v = "india";
		System.out.println(u.toLowerCase());
		System.out.println(v.toUpperCase());
	
		

	}

}
