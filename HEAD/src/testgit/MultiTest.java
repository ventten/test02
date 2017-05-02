package testgit;

class A {  
	
    public String show(D obj){  
           return ("A and D");  
    }   
    public String show(A obj){  
           return ("A and A");  
    }
    public String show(C obj){  
           return ("A and C");  
    }
}   
class B extends A{ 
    public String show(A obj){  
           return ("B and A");  
    }   
    public String show(B obj){  
           return ("B and B");  
    } 
}  
class C extends B{
	 public String show(A obj){  
         return ("C and A");  
	 }
	 public String show(C obj){  
         return ("C and C");  
	 }
}   
class D extends B{} 

public class MultiTest{ 
public static void main(String[] args){ 
        A ab = new C();  
        B b = new B();  
        C c = new C(); 
        D d = new D();
        System.out.println(ab.show(b));   
        System.out.println(ab.show(c)); 
        System.out.println(c.show(b)); 

} 
} 
