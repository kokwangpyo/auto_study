public class Ex1 {
	static int total = 0;
	
	public static void main(String[] args) {
		
		String str1 = "개발";
		String str2 = "개발";
		String str3 = new String("개발"); 
		String str4 = new String("개발");
		
		int num1 = 10;
		int num2 = 20;
		int num3;
		num3 = add(num1, num2);
		System.out.println(num3);
	}	
	static int add(int temp1, int temp2) {
		total++;
		return(temp1+temp2);
	}
}
