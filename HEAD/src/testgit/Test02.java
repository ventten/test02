package testgit;


public class Test02 {

	public static void main(String[] args) {
		String aString = "abc";
		String b = "abc";
		
		String a = new String("abc");
		String a1 = new String("abc");
		System.out.println(a==a1);
		
		Test02 test02 = new Test02(null);
	}
	
	public Test02(String str){
		System.out.println("×Ö·û´®£º"+str);
	}
	
	public Test02(Object str){
		System.out.println("¶ÔÏó£º"+str);
	}

}
