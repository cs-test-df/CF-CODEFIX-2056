import java.io.UnsupportedEncodingException;

public class StringClassExample1 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s1 = "This is my String";
		String s2 = new String(s1);
		System.out.println("Content of String s1 : "+s1);
		System.out.println("Content of String s2 : "+s2);
		s2 = s1+" This part is Added";
		System.out.println("Modified s2 value : "+s2);
		//chatAt(int index)
		System.out.println("Character at position 11 in string s1 is : "+s1.charAt(11));
		//getChars(start,end,charArry,index)
		int start = 0;    
		int end = 14;     
		char buf[] = new char[20]; 
	    s2.getChars(start, end, buf, 0); 
		System.out.println(buf);
		//getBytes
		byte[] s4 = s2.getBytes(); // default Charset Encoding
		for(byte b : s4){
			System.out.print(b+" ");
		}
		System.out.println("");
		byte[] s5 = s2.getBytes("UTF-16"); // default Charset Encoding
		for(byte b : s5){
			System.out.print(b+" ");
		}
		// toCharArray
		char[] s6 = s2.toCharArray();
		System.out.println();
		for(char a : s6){
		System.out.println(a);
		}
	}

}
