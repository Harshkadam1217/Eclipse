package javaa.basics;
// converting primitive to string type
public class Eg5 {

	public static void main(String[] args) {
		int i=10;
		System.out.println("Primitive value " + i);
		String s1=Integer.toString(i);
		
		
		float f1=i;
		String s11=Float.toString(f1);
		System.out.println("String type "  + s1);
		System.out.println("Float type "+ s11);
		String s22=Float.toHexString(f1);
		System.out.println("String to hexa decimal " + s22);
		
		
		String s2=""+i;
		System.out.println("String Type "+ s2);
		
		
		//Converting String type to Integer type
		
		String s12="1000";
		int i1=Integer.parseInt(s12);
		System.out.println("String to int  " + i1);
		
	}

}
